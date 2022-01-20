package com.jos.dem.kata

class PopularFinder {

    fun find(numbers: List<Int>): Int = numbers.groupBy { it }.maxByOrNull { it.value.size }?.key!!

}
