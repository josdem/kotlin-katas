package com.jos.dem.kata

import java.lang.String
import kotlin.Int

class DigitalAdder {
    fun add(numbers: List<Int>): List<Int> {
        val numbersAsString = numbers.map { String.valueOf(it) }
        return numbers
    }

}
