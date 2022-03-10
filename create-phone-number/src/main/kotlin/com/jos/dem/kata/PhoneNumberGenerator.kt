package com.jos.dem.kata

class PhoneNumberGenerator {

    fun format(array: IntArray): String {
        val arrayAsString = array.joinToString("")
        return "(${arrayAsString.substring(0..2)}) ${arrayAsString.substring(3..5)}-${arrayAsString.substring(6)}"
    }

}
