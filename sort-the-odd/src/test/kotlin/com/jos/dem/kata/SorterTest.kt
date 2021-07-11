package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SorterTest {

    private val sorter : Sorter = Sorter()

    @Test
    fun `should sort some arrays`() {
        assertArrayEquals(intArrayOf(1, 3, 2, 8, 5, 4), sorter.sort(intArrayOf(5, 3, 2, 8, 1, 4)))
        assertArrayEquals(intArrayOf(1, 3, 5, 8, 0), sorter.sort(intArrayOf(5, 3, 1, 8, 0)))
    }

    @Test
    fun `should sort an empty array`() {
        assertArrayEquals(intArrayOf(), sorter.sort(intArrayOf()));
    }

    @Test
    fun `should sort duplicated elements array`(){
        assertArrayEquals(
            intArrayOf(1, 1, 5, 11, 2, 11, 111, 0),
            sorter.sort(intArrayOf(1, 111, 11, 11, 2, 1, 5, 0))
        )
    }
}