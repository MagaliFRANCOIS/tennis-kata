package com.lafoncierenumerique.formation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TennisScoreTest {
    @Test
    @DisplayName("Should Return Game Score")
    fun getGameScoreTest(){
        // Given
        val game = Game()

        // When
        val score = game.getScore()

        // Then
        assertThat(score).isEqualTo(Score("0","0"))
    }
}