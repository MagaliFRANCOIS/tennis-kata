package com.lafoncierenumerique.formation

class Game (private val player1 : Player, private val player2 : Player) {
    var hasPlayer1Score = false
    fun getScore() : Score {
        val point1 = Point("0", player1)
        val point2 = Point("0", player2)

        return Score(point1, point2)
    }

    fun getScoreOf(player: Player): Point {
        if (hasPlayer1Score)
            return Point("15", player)
        return Point("0", player)
    }

    fun addPointPlayer(player1: Player) {
        hasPlayer1Score = true
    }

}
