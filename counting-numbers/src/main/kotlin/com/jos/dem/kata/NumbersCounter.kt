package com.jos.dem.kata

/*
Given an integer collection, return an array with three elements:
how many of them are positive, how many negative and how many are zeros.
Given: [-4, 3, -9, 0, 4, 1] then expected output is: [3, 2, 1]
 */

class NumbersCounter {

    fun count(numbers: IntArray): IntArray = intArrayOf(numbers.count { it > 0 }, numbers.count { it < 0 }, numbers.count {it == 0})

}
