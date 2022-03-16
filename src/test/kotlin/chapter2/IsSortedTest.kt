package chapter2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsSortedTest {
    @Test
    fun `listOf() isSorted`() {
        assertTrue(isSorted(listOf<Int>()) { x, y -> x < y })
    }

    @Test
    fun `listOf(3) isSorted`() {
        assertTrue(isSorted(listOf(3)) { x, y -> x < y })
    }

    @Test
    fun `listOf(1, 2) isSorted`() {
        assertTrue(isSorted(listOf(1, 2)) { x, y -> x < y })
    }

    @Test
    fun `listOf(2, 1) is not sorted`() {
        assertFalse(isSorted(listOf(2, 1)) { x, y -> x < y })
    }
}