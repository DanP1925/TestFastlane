package com.athelas.pruebafastlane

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.athelas.pruebafastlane.MainActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule @JvmField var mainActivityTestRule = object :
            ActivityTestRule<MainActivity>(MainActivity::class.java){

    }

    @Test
    fun writeText() {
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_plus)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
    }
}
