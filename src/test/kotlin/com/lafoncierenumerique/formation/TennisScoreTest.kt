package com.lafoncierenumerique.formation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TennisScoreTest {
    @BeforeEach
    internal fun setUp() {
        val player1 = Player("Joueur 1")
        val player2 = Player("Joueur 2")
        // un test

        val game = Game(player1, player2)
    }

    /*@Test
    @DisplayName("Should Return Game Score")
    fun getGameScoreTest(){
        // Given
        val game = Game()

        // When
        val score = game.getScore()

        // Then
        assertThat(score).isEqualTo(Score("0","0"))
    }*/

    @Test
    @DisplayName("Should Return Player Score")
    fun GetPlayer1ScoreTest () {
        // Given
        val player1 = Player("Joueur 1")
        val player2 = Player("Joueur 2")

        val game = Game(player1, player2)

        // When
        val score = game.getScoreOf(player1)

        // Then
        assertThat(score).isEqualTo(Point("0", player1))
    }

    @Test
    @DisplayName("Should Return Players Score")
    fun GetGamePlayersScoreTest (){
        // Given
        val player1 = Player("Joueur 1")
        val player2 = Player("Joueur 2")
        val game = Game(player1, player2)

        // When

        val score = game.getScore()

        // Then
        assertThat(score).isEqualTo(Score(Point("0", player1), Point("0", player2)))
    }

    @Test
    @DisplayName("Should Return Players Score With Another Name")
    fun GetGamePlayersNameScoreTest (){
        // Given
        val player1 = Player("John")
        val player2 = Player("Jack")
        val game = Game(player1, player2)

        // When

        val score = game.getScore()

        // Then
        assertThat(score).isEqualTo(Score(Point("0", player1), Point("0", player2)))
    }

    @Test
    @DisplayName("Should Return Player Score")
    fun GetPlayer2ScoreTest () {
        // Given
        val player1 = Player("Joueur 1")
        val player2 = Player("Joueur 2")

        val game = Game(player1, player2)

        // When
        val score = game.getScoreOf(player2)

        // Then
        assertThat(score).isEqualTo(Point("0", player2))
    }

    @Test
    @DisplayName("Should display score when player 1 win exchange")
    fun GetPlayer1ScoreAfterWinExchange () {
        // Given
        val player1 = Player("Joueur 1")
        val player2 = Player ("Joueur 2")

        val game = Game(player1, player2)

        // When
         game.addPointPlayer(player1)
         val score = game.getScoreOf(player1)

        // Then
        assertThat(score).isEqualTo(Point("15", player1))
    }
}