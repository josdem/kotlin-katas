package com.jos.dem.kata

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