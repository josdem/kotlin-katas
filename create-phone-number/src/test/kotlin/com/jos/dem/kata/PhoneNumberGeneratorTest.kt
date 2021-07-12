package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PhoneNumberGeneratorTest {

    private val phoneNumberGenerator : PhoneNumberGenerator = PhoneNumberGenerator()

    @Test
    fun `should format phone number`(){
        assertEquals(
            "(123) 456-7890", phoneNumberGenerator.format(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))
        )
    }

}