package com.lafoncierenumerique.formation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Greeting test case.
 */
class GreetingTest {

    /**
     * Given the user name is "Kotlin"
     * When we call "sayHai" with user name.
     * Then it should return "Hello Kotlin!"
     */
    @Test
    fun sayHiWithParameter() {
        assertThat(sayHi("Kotlin")).isEqualTo("Hello Kotlin!")
    }

    /**
     * Given the user name is not specified
     * When we call "sayHai" without any parameter.
     * Then it should return "Hello World!"
     */
    @Test
    fun sayHiWithoutParameter() {
        assertThat(sayHi()).isEqualTo("Hello World!")
    }
}