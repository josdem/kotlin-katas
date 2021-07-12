package com.jos.dem.kata

/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 */

class PhoneNumberGenerator {
    
    fun format(array: IntArray): String {
        val arrayAsString = array.joinToString("")
        return "(${arrayAsString.substring(0..2)}) ${arrayAsString.substring(3..5)}-${arrayAsString.substring(6)}"
    }

}
