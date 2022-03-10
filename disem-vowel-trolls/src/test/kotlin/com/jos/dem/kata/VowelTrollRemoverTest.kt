package com.jos.dem.kata

/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and returns a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VowelTrollRemoverTest {

    private val remover = VowelTrollRemover()

    @Test
    fun `should remove vowels`() {
        assertEquals("Ths wbst s fr lsrs LL!", remover.remove("This website is for losers LOL!"));
        assertEquals(
            "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
            remover.remove("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", remover.remove("What are you, a communist?"));
    }
}