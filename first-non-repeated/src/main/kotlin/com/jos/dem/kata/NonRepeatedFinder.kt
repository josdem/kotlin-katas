package com.jos.dem.kata

class NonRepeatedFinder {

    fun find(numbers: List<Int>): Int = numbers.groupBy { it }.filter { it.value.size == 1 }.keys.elementAt(0)

}
