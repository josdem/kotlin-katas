package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/*
Given an integer collection, return an array with three elements:
how many of them are positive, how many negatives, and how many zeros.
Given: [-4, 3, -9, 0, 4, 1] then expected output is: [3, 2, 1]
 */

class NumbersCounterTest {

    private val numbersCounter: NumbersCounter = NumbersCounter()

    @Test
    fun `should count numbers`() {
        assertArrayEquals(intArrayOf(3, 2, 1), numbersCounter.count(intArrayOf(-4, 3, -9, 0, 4, 1)))
    }
}