package com.akshay8700.counterapp.ui.theme

data class CounterModel(var count: Int)

class CounterRepository(){
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }
    fun decrementCounter(){
        _counter.count--
    }
}