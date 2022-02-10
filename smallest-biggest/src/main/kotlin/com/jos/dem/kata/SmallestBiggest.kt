package com.jos.dem.kata

class SmallestBiggest {

    fun find(numbers: List<Int>): List<Int> {
        val smallest = numbers.minOrNull()
        val biggest = numbers.maxOrNull()
        return listOf(smallest ?: 0, biggest ?: 0)
    }

}
