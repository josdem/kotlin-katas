package com.jos.dem.kata;

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CommonElementsTest {

    private val commonElements: CommonElements = CommonElements()

    @Test
    @DisplayName("find common elements")
    fun shouldFindCommonElements() {
        assertEquals(
            listOf(1, 3, 5),
            commonElements.find(listOf(1, 2, 3, 4, 5), listOf(1, 3, 5, 7, 9))
        );
    }
}
