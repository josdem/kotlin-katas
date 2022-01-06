package com.jos.dem.kata

/*
Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store.
The store sells N different brands of keyboards and M different brands of USB drives.
Monica has exactly S dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).
Given: Amount of money Monica has to spend in electronics as 10
And: Keyboards prices as [3, 1]
And: Usbs' prices as [5, 2, 8]
When: I call to compute method
Then: I will have 9 as result
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShopCalculatorTest {

    private val shopCalculator : ShopCalculator = ShopCalculator()

    @Test
    fun `should get biggest electronic pair spend`(){
        val amount = 10
        val usbs = listOf<Int>(5, 2, 8)
        val keyboards = listOf<Int>(3, 1)
        assertEquals(9, shopCalculator.compute(amount, keyboards, usbs))
    }

}