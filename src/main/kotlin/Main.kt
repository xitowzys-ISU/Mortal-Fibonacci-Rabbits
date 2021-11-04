import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n: Int = sc.nextInt()
    val m: Int = sc.nextInt()

    val F = LongArray(n + 1)
    val rabit = LongArray(m)

    rabit[0] = 1
    F[1] = 1

    for (i in 2..n) {
        val next = LongArray(m)

        for (j in 1 until m) {
            next[j] = rabit[j - 1]
            next[0] += rabit[j]
        }

        for (k in 0 until m) {
            rabit[k] = next[k]
            F[i] += rabit[k]
        }
    }

    println("На ${n}-м месяце есть ${F[n]} кролика.")
}