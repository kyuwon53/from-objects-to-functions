package chapter1

import io.kotest.matchers.shouldBe
import org.example.chapter1.CashRegister
import org.junit.jupiter.api.Test

class CashRegisterTest {
    @Test
    fun `checkout`() {
        val priceInfo = mapOf("milk" to 1.5, "bread" to 0.9)
        val promotions = mapOf("milk" to "3x2", "eggs" to "8x6")

        val cashRegister = CashRegister(priceInfo, promotions)

        val givenProducts = listOf("milk","milk","milk")
        cashRegister.checkout(givenProducts) shouldBe 3.0
    }
}