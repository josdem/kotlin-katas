package com.jos.dem.kata

/*
Write a function that accepts an array of 10 positive integers and returns a string with those numbers in phone number format.
Given [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
When I call format method
Then I validate phone number is (123) 456-7890
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PhoneNumberGeneratorTest {

    private val phoneNumberGenerator: PhoneNumberGenerator = PhoneNumberGenerator()

    @Test
    fun `should format phone number`() {
        assertEquals(
            "(123) 456-7890", phoneNumberGenerator.format(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))
        )
    }

}