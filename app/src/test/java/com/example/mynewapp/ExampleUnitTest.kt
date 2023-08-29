package com.example.mynewapp

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testStringComparison() {
        val model = Model()
        assertTrue(model.compareStrings("hello", "hello"))
        assertFalse(model.compareStrings("hello", "world"))
    }
}
