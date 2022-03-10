package com.jos.dem.kata

/*
Credit card information is important, therefore, you don't want that information to be all visible. Write a function named maskify, which changes all but the last four characters into #.
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaskaratorTest {

    private val maskarator = Maskarator()

    @Test
    fun `should not maskify short strings`() {
        assertEquals("1", maskarator.maskify("1"))
        assertEquals("", maskarator.maskify(""))
    }

    @Test
    fun `should maskify string`() {
        assertEquals("############5616", maskarator.maskify("4556364607935616"))
        assertEquals("#######5616", maskarator.maskify("64607935616"))
    }

    @Test
    fun `should maskify special strings`() {
        assertEquals("##ippy", maskarator.maskify("Skippy"))
        assertEquals(
            "####################################man!",
            maskarator.maskify("Nananananananananananananananana Batman!")
        )
    }

}