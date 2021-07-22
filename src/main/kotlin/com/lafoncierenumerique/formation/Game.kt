package com.lafoncierenumerique.formation

import java.lang.IllegalArgumentException

class Game (private val player1 : Player, private val player2 : Player) {
    //var hasPlayer1Score: Int = 0
    fun getScore() : Score {
        val point1 = Point("0", player1)
        val point2 = Point("0", player2)

        return Score(point1, point2)
    }

    fun getScoreOf(player: Player): Point {
        return when (player.scorePlayer) {
            0 -> Point("0", player)
            1 -> Point("15", player)
            2 -> Point("30", player)
            3 -> Point("40", player)
            else -> throw IllegalArgumentException("$player.scorePlayer")
        }
    }

    fun addPointPlayer(player: Player) {
        player.scorePlayer += 1
    }

}
