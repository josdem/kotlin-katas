package com.jos.dem.kata

/*
Given an array of integers
When I call findIt method
Then I validate it is the one that appears an odd number of times.
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OddFinderTest {

    private val oddFinder: OddFinder = OddFinder()

    @Test
    fun `should find the odd`() {
        assertEquals(
            5, oddFinder.findIt(intArrayOf(20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5))
        )
        assertEquals(-1, oddFinder.findIt(intArrayOf(1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5)))
        assertEquals(5, oddFinder.findIt(intArrayOf(20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5)))
        assertEquals(10, oddFinder.findIt(intArrayOf(10)))
        assertEquals(10, oddFinder.findIt(intArrayOf(1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1)))
        assertEquals(1, oddFinder.findIt(intArrayOf(5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10)))

    }
}