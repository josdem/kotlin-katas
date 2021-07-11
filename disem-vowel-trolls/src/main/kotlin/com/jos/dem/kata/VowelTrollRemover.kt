package com.jos.dem.kata

/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 */

import java.util.stream.Collectors

class VowelTrollRemover {

    fun remove(keyword: String): String {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        
        return keyword
            .chars()
            .mapToObj { it.toChar() }
            .filter { !vowels.contains(it) }
            .map { it.toString() }
            .collect(Collectors.joining())
    }
}