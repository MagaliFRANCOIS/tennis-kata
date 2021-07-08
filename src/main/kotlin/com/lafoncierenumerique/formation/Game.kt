package com.lafoncierenumerique.formation

class Game (private val player1 : Player, private val player2 : Player) {
    fun getScore() : Score {
        val point1 = Point("0", player1)
        val point2 = Point("0", player2)

        return Score(point1, point2)
    }

    fun getScoreOf(player: Player): Point {
        return Point("0", player)
    }

}
