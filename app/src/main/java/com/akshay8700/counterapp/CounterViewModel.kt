package com.akshay8700.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.akshay8700.counterapp.ui.theme.CounterRepository

class CounterViewModel() : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment(){
        _repository.incrementCounter()

        // Updating count value on display with the help of this
        // Actually repository.incrementCounter() is just increasing original value of _counter in
        // counter model but not updating this in UI because original counter is not storing value
        // as mutableStateOf() because mutableStateOf is an observable and so its recompose UI ever something change in this
        _count.value = _repository.getCounter().count
    }
    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}