package com.akshay8700.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count = mutableStateOf(0)
    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment(){
        _count.value++
    }
    fun decrement(){
        _count.value--
    }
}