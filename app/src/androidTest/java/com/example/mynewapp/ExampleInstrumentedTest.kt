package com.example.mynewapp

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUIEqual() {
        onView(withId(R.id.editText1)).perform(typeText("hola"))
        onView(withId(R.id.editText2)).perform(typeText("hola"))
        closeSoftKeyboard()
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Los textos son iguales")))
    }
    @Test
    fun testUIDifferent() {
        onView(withId(R.id.editText1)).perform(typeText("hola"))
        onView(withId(R.id.editText2)).perform(typeText("probando"))
        closeSoftKeyboard()
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Las cadenas son diferentes")))
    }
}