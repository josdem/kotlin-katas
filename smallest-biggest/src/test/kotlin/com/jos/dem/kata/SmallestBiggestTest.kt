package com.jos.dem.kata

/*
Find smaller and biggest numbers in a collection
Given: A collection like [7, 5, 2, 4, 3, 9]
When: I call find method
Then: I will get a collection with [2, 9] values
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestBiggestTest {

    private val smallestBiggest: SmallestBiggest = SmallestBiggest()

    @Test
    fun `should find smallest and biggest`() {
        val numbers = listOf(7, 5, 2, 4, 3, 9)
        assertEquals(listOf(2, 9), smallestBiggest.find(numbers))
    }
}