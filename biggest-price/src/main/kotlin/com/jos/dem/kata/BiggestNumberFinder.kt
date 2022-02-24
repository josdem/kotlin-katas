package com.jos.dem.kata

class BiggestNumberFinder {

    private val pattern = "-?[0-9]+.?[0-9]+"

    fun find(data: List<String>): Double {
        return data.filter { it.matches(pattern.toRegex()) }
            .map { it.toDouble() }.maxOrNull() ?: 0.0
    }

}
