package org.example.chapter1

class CashRegister(
    val priceInfo: Map<String, Double>,
    val promotions: Map<String, String>,
) {

    fun checkout(products: List<String>): Double {
        val productCounts = products.groupingBy { it }.eachCount()

        return productCounts.entries.sumOf { (product, count) ->
            val price = priceInfo[product] ?: 0.0
            val promotion = promotions[product]

            if (promotion != null) {
                val (m, n) = promotion.split("x").map { it.toInt() }
                val promoSets = count / m
                val remainder = count % m
                (promoSets * n + remainder) * price
            } else {
                count * price
            }
        }
    }
}