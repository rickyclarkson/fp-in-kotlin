package chapter2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


class FibTest {
    @Test
    fun `first 9 fibonacci numbers`() {
        assertEquals(listOf(0, 1, 1, 2, 3, 5, 8, 13, 21),
            (0..8).map(::fib))
    }
}
