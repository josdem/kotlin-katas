package com.jos.dem.kata

class NumbersCounter {

    fun count(numbers: IntArray): IntArray =
        intArrayOf(numbers.count { it > 0 }, numbers.count { it < 0 }, numbers.count { it == 0 })


}
