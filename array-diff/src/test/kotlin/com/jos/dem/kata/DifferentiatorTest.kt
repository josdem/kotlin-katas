package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DifferentiatorTest {

    private val differentiator: Differentiator = Differentiator()

    @Test
    fun `should get difference in arrays`(){
        assertArrayEquals(intArrayOf(2), differentiator.diff(intArrayOf(1, 2), intArrayOf(1)))
        assertArrayEquals(intArrayOf(2, 2), differentiator.diff(intArrayOf(1, 2, 2), intArrayOf(1)))
        assertArrayEquals(intArrayOf(1), differentiator.diff(intArrayOf(1, 2, 2), intArrayOf(2)))
        assertArrayEquals(intArrayOf(1, 2, 2), differentiator.diff(intArrayOf(1, 2, 2), intArrayOf()))
        assertArrayEquals(intArrayOf(), differentiator.diff(intArrayOf(), intArrayOf(1, 2)))
    }
}