package com.jos.dem.kata

/*
Given a number, collection find the first non-repeated number in that collection
When we have: [25, 25, 18, 18, 18, 36, 1, 2, 2, 34] first non-repeated number is 36
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NonRepeatedFinderTest {

    private val nonRepeatedFinder: NonRepeatedFinder = NonRepeatedFinder()

    @Test
    fun `should find first non repeated`() {
        assertEquals(36, nonRepeatedFinder.find(listOf(25, 25, 18, 18, 18, 36, 1, 2, 2, 34)));
    }


}