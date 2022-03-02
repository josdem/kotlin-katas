package com.jos.dem.kata;

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

/*
Given two arrays with integers.
Then I want to return elements in common.
Input: [1,2,3,4,5] and [1,3,5,7,9]
Output: [1, 3 ,5]
*/

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
