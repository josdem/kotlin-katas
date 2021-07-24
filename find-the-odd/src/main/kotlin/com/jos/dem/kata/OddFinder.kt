package com.jos.dem.kata

/*
Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */

class OddFinder {
    fun findIt(array: IntArray): Int {
        return array.groupBy { it }.entries.first { it.value.size % 2 == 1 }.key
    }

}
