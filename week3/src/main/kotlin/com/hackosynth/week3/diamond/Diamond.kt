package com.hackosynth.week3.diamond

object Diamond {
    fun printToList(letter: Char): List<String>  {
        val horizontal = (letter.downTo('A') + ('B'..letter)).map {it.toString()}
        val vertical = (('A'..letter) + (letter-1).downTo('A')).map {it.toString()}
        val output = vertical
            .map {v ->
                horizontal
                .fold("") { acc, h ->
                    if (v != h) "$acc "
                    else acc + h
                }
            }
        output.forEach{println("$it")}
        return output
    }
}