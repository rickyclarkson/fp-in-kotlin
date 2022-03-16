package chapter2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CurryTest {
    @Test
    fun `curry(Int#plus)(3)(4) == 3 + 4`() {
        assertEquals(3 + 4, curry { x: Int, y: Int -> x + y }(3)(4))
    }

    @Test
    fun `uncurry { x arrow { x + it } }(3, 4) == 3 + 4`() {
        assertEquals(3 + 4, uncurry { x: Int -> { y: Int -> x + y } }(3, 4))
    }

    @Test
    fun `compose({ it times 2 }) { it + 3 }(4) == (4 + 3) times 2`() {
        assertEquals((4 + 3) * 2, compose({ x: Int -> x * 2 }) { y: Int -> y + 3 }(4))
    }
}