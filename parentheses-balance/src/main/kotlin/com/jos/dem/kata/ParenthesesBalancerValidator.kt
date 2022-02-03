package com.jos.dem.kata

class ParenthesesBalancerValidator {
    fun isBalanced(keyword: String): Boolean = keyword.count { it == '(' } == keyword.count { it == ')' }
}
