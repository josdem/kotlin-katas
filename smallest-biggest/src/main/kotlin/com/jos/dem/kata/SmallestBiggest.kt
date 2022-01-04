package com.jos.dem.kata

/*
Find smaller and biggest numbers in a collection
Given: A collection like [7, 5, 2, 4, 3, 9]
When: I call find method
Then: I will get a collection with [2, 9] values
 */

class SmallestBiggest {

    fun find(numbers: List<Int>): List<Int> {
        val smallest = numbers.minOrNull()
        val biggest = numbers.maxOrNull()
        return listOf(smallest ?: 0, biggest ?: 0)
    }

}
