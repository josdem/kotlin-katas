package com.jos.dem.kata

/*
Given: A numeric collection
When: I call add method
Then: I will get a collection with every element summing its digits
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DigitalAdderTest {

    private val digitalAdder : DigitalAdder = DigitalAdder()

    @Test
    fun `should sum every element in collection`(){
        val numbers = listOf(15, 20, 4, 8)
        val expectedCollection = listOf(6, 2, 4, 8)
        assertEquals(expectedCollection, digitalAdder.add(numbers))
    }
}