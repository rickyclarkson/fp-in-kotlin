package chapter2

fun fib(i: Int): Int = when {
    i < 2 -> i
    else -> fib(i - 2) + fib(i - 1)
}
