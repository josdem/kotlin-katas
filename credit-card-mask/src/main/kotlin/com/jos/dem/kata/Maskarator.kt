package com.jos.dem.kata

class Maskarator {

    fun maskify(keyword: String): String {
        return keyword.replace(".(?=.{4})".toRegex(), "#")
    }

}
