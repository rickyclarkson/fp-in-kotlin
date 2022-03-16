package chapter2

val <T> List<T>.tail: List<T>
  get() = drop(1)

val <T> List<T>.head: T
  get() = first()

fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean = when {
    aa.isEmpty() -> true
    aa.tail.isEmpty() -> true
    order(aa.head, aa.tail.head) -> isSorted(aa.tail, order)
    else -> false
}