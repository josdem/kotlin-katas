package com.jos.dem.kata

/*
Given a numbers collection find fist non-repeated number in that collection
When we have: [25, 25, 18, 18, 18, 36, 1, 2, 2, 34] first non-repeated number is 36
 */

class NonRepeatedFinder {

    fun find(numbers: List<Int>): Int {
        return numbers.groupBy { it }.filter { it.value.size == 1 }.keys.elementAt(0)
    }

}
