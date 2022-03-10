package com.jos.dem.kata

class OddFinder {
    fun findIt(array: IntArray): Int {
        return array.groupBy { it }.entries.first { it.value.size % 2 == 1 }.key
    }

}
