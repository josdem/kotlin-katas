package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CollectionAdderTest {

    private val collectionAdder: CollectionAdder = CollectionAdder()

    @Test
    @DisplayName("Accumulating a collection")
    fun `should sum a collection`() {
        assertEquals(31, collectionAdder.sum(listOf(1, 2, 3, 4, 10, 11)))
        assertEquals(21, collectionAdder.sum(listOf(5, 4, 1, 2, 9)))
    }


}