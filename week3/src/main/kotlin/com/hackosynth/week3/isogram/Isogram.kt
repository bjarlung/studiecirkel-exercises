package com.hackosynth.week3.isogram

object Isogram {
    fun isIsogram(input: String): Boolean =
        ('a'..'z').none { letter: Char ->
            input.filter { it.isLetter() }.toLowerCase()
                .filter { wordChar: Char -> wordChar == letter }.length > 1
        }
}



/*
fun isIsogram(input: String): Boolean {
    val allLowerCaseLetters = input.filter { it.isLetter() }.toLowerCase()
    val alphabet = 'a'..'z'

    val duplicates = alphabet.filter { letter: Char ->
        allLowerCaseLetters.filter { wordChar: Char -> wordChar == letter }.length > 1
    }
    return duplicates.isEmpty()
}

 */