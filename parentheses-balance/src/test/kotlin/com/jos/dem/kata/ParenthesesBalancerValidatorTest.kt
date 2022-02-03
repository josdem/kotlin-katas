package com.jos.dem.kata

/**
 *  Given a string
 *  When I call isBalanced method
 *  Then return a boolean indicating whether that string has balanced parentheses.
 */

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ParenthesesBalancerValidatorTest {

    private val validator: ParenthesesBalancerValidator = ParenthesesBalancerValidator()

    @Test
    fun `should check if keyword is balanced`() {
        val keyword = "ab(c)(d())"
        assertTrue(validator.isBalanced(keyword), "string is balanced")
    }

    @Test
    fun `should validate keyword is not balanced`() {
        val keyword = "((x()())"
        assertFalse(validator.isBalanced(keyword), "string is not balanced")
    }
}