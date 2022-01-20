package com.jos.dem.kata

/*
Given a collection with numbers: [34 , 31, 34, 56, 12, 35, 24, 34, 69, 18]
Write a function that finds most popular number in the array, in this case 34 because it is the number that appears most often.
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PopularFinderTest {

    private val popularFinder: PopularFinder = PopularFinder()

    @Test
    @DisplayName("find most popular")
    fun `should find most popular`() {
        assertEquals(34, popularFinder.find(listOf(34, 31, 34, 56, 12, 35, 24, 34, 69, 18)))
    }
}