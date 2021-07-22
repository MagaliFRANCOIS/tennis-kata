package com.lafoncierenumerique.formation

import java.lang.IllegalArgumentException

class Game (private val player1 : Player, private val player2 : Player) {
    var hasPlayer1Score: Int = 0
    fun getScore() : Score {
        val point1 = Point("0", player1)
        val point2 = Point("0", player2)

        return Score(point1, point2)
    }

    fun getScoreOf(player: Player): Point {
        return when (hasPlayer1Score) {
            0 -> Point("0", player)
            1 -> Point("15", player)
            2 -> Point("30", player)
            else -> throw IllegalArgumentException("$hasPlayer1Score")
        }
    }

    fun addPointPlayer(player1: Player) {
        hasPlayer1Score += 1
    }

}
