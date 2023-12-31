package com.l_george.test_cofee.data.models

import com.yandex.mapkit.geometry.Point

data class CoffeeShopModel(
    val id: Int,
    val name: String,
    val point: Point,
    val distanceFromMe:String? = "0 km"
)