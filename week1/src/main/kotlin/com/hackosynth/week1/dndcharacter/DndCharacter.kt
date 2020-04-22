package com.hackosynth.week1.dndcharacter

import kotlin.math.floor

class DndCharacter {
    val strength: Int = TODO()
    val dexterity: Int = TODO()
    val constitution: Int = TODO()
    val intelligence: Int = TODO()
    val wisdom: Int = TODO()
    val charisma: Int = TODO()

    val hitpoints: Int = TODO()

    companion object {
        /**
         * Generates an ability score following the rules for rolling ability scores in DnD
         * @return the generated score
         */

        fun generateAbilityScore(): Int {
            fun randomNumber(): Int = (1..6).random()
            var diceList = mutableListOf<Int>()
            for(i in 0..3){
                diceList.add(randomNumber())
            }
            diceList.sort()
            diceList.removeAt(0)
            return diceList.sum()
        }

            /**
             * Returns the modifier that a given ability score would have
             * @param score - the ability score
             * @return the modifier for the given score
             */
            fun getAbilityModifier(score: Int): Int = floor((score.toDouble()-10) /2).toInt()
    }
}
/*
fun main(){
    println(DndCharacter.generateAbilityScore())
}

 */