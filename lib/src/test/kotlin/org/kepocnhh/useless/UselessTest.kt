package org.kepocnhh.useless

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UselessTest {
    @Test
    fun getOneTest() {
        val expected = 1
        val actual = Useless.getOne()
        assertEquals(expected, actual)
    }

    @Test
    fun getThreeTest() {
        val expected = 3
        val actual = Useless.getThree()
        assertEquals(expected, actual)
    }
}
