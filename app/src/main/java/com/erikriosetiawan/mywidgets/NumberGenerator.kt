package com.erikriosetiawan.mywidgets

import kotlin.random.Random

internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random.Default
        return random.nextInt(max)
    }
}