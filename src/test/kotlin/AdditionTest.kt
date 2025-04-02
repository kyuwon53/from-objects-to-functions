import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdditionTest {
    @Test
    fun `add two numbers`() {
        assertThat(5 + 6).isEqualTo(11)
        assertThat(7 + 42).isEqualTo(49)
        assertThat(9999 + 1).isEqualTo(10000)

        5 + 6 shouldBe  11
        7 + 42 shouldBe 49
        9999 + 1 shouldBe 10000
    }
}