package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NonRepeatedFinderTest {

    private val nonRepeatedFinder : NonRepeatedFinder = NonRepeatedFinder()

    @Test
    fun `should find first non repeated`(){
        assertEquals(36, nonRepeatedFinder.find(listOf(25, 25, 18, 18, 18, 36, 1, 2, 2, 34)));
    }


}