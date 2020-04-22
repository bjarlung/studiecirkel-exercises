package com.hackosynth.week3.naturalnumber

import java.lang.IllegalArgumentException

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

object NaturalNumber {
    fun classify(naturalNumber: Int): Classification =
        when(aliquot(naturalNumber)) {
            naturalNumber -> Classification.PERFECT
            in 0..naturalNumber -> Classification.DEFICIENT
            in naturalNumber..Int.MAX_VALUE -> Classification.ABUNDANT
            else -> throw IllegalArgumentException("Unexpected digit")
        }

    fun aliquot(number: Int): Int =
        if(number == 1 ) 0 else
        (1..number)
            .toList()
            .dropLast(1)
            .reduce { acc, num ->
             if (number % num == 0) acc + num  else acc }
}