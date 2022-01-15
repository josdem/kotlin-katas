package com.jos.dem.kata

import java.lang.String
import kotlin.Int

class DigitalAdder {
    fun add(numbers: List<Int>): List<Int> {
        val numbersAsString = numbers.map { String.valueOf(it) }
        return numbersAsString.map { string -> string.chars().map { Integer.valueOf(Character.toString(it)) }.sum() }
    }

}
