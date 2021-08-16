package com.jos.dem.kata

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