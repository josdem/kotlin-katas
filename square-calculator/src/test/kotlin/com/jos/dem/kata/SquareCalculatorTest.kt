package com.jos.dem.kata

/*
Given: A numeric list
When: I call square method
Then: I will get another list with every element squared.
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SquareCalculatorTest {

    private val squareCalculator: SquareCalculator = SquareCalculator()

    @Test
    fun `should square my list`() {
        val numbers = listOf(1, 2, 3, 7, 9, 12, 15)
        assertEquals(listOf(1, 4, 9, 49, 81, 144, 225), squareCalculator.square(numbers))
    }
}