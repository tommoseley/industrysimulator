package com.tommoseley.industrysimulator

import java.time.Duration

class Catalog private constructor() {
    companion object {
        private val instance = Catalog()

        fun getInstance(): Catalog {
            return instance
        }
    }
    val things: List<Thing> = listOf(
        Thing("Carbon", 10, listOf(
            PriceOption("freight", 10, Duration.ofMinutes(5)),
            PriceOption("express", 25, Duration.ofSeconds(30)),
            PriceOption("retail", 50, Duration.ZERO)
        ))
        ,Thing("Iron Ingot", 25, listOf(
            PriceOption("freight", 25, Duration.ofMinutes(5)),
            PriceOption("express", 50, Duration.ofSeconds(30)),
            PriceOption("retail", 100, Duration.ZERO)
        ))
        ,Thing("Steel Ingot", 125, listOf(
            PriceOption("freight", 125, Duration.ofMinutes(5)),
            PriceOption("express", 250, Duration.ofSeconds(30)),
            PriceOption("retail", 500, Duration.ZERO)
        ))
        ,Thing("Steel Plate", 400, listOf(
            PriceOption("freight", 400, Duration.ofMinutes(5)),
            PriceOption("express", 800, Duration.ofSeconds(30)),
            PriceOption("retail", 2000, Duration.ZERO)
        ))
        ,Thing("Steel Sheet", 600, listOf(
            PriceOption("express", 1000, Duration.ofSeconds(30)),
            PriceOption("retail", 3500, Duration.ZERO)
        ))
    )
}