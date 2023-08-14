package com.tommoseley.industrysimulator

import java.time.Duration

data class PriceOption(val name : String, val price: Int, val deliveryTime : Duration)
data class Thing (val name : String, val salePrice: Int, val priceOptions : List<PriceOption>)
