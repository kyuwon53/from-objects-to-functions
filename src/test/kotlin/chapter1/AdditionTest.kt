package chapter1

import io.kotest.matchers.shouldBe
import kotlin.random.Random
import kotlin.test.Test

class AdditionTest {
    fun randomNatural() = Random.nextInt(from = 1, until = 100_000_000)

    @Test
    fun `adding Y is equal to adding one Y times`() {

        repeat(100) {
            val x = randomNatural()

            val y = Random.nextInt(1, 100)

            val ones = List(y) { 1 }

            val z = ones.fold(x) { acc, one -> acc + one }

            z shouldBe x + y
        }
    }
}