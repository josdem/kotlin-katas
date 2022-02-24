package com.jos.dem.kata

class BiggestNumberFinder {

    private val pattern = "-?[0-9]+.?[0-9]+"

    fun find(data: List<String>): Double {
        return data.filter { it.matches(pattern.toRegex()) }.maxOfOrNull { it.toDouble() } ?: 0.0
    }

}
