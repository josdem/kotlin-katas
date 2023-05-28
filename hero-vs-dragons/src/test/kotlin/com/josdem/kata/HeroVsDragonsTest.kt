package com.josdem.kata

/**
 * Given number of bullets and number of dragons
 * When I call fight method
 * Then return true if hero wins the fight
 * Note: Each dragon takes 2 bullets to be defeated
 */

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class HeroVsDragonsTest {
    private val heroVsDragons: HeroVsDragons = HeroVsDragons()

    @Test
    fun `should return true when hero is stronger than dragon`() {
        assertTrue(heroVsDragons.fight(10, 5), "Hero should win")
        assertTrue(heroVsDragons.fight(100, 40), "Hero should win")
    }

    @Test
    fun `should return false when hero is weaker than dragon`() {
        assertFalse(
            heroVsDragons.fight(1706635620, 1391914725),
            "With 1706635620 bullets and 1391914725 dragons, hero should lose"
        )
    }
}