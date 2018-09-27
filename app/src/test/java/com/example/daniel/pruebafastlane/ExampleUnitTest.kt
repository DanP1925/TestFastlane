package com.example.daniel.pruebafastlane

import junit.framework.Assert.assertTrue
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert
import org.junit.Test

import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var mainActivity: MainActivity

    @Before fun setupActivity(){

        mainActivity = MainActivity()

        mainActivity.result = ""
    }

    @Test fun addTextTest(){
        mainActivity.addText(5.toString())

        assertTrue(mainActivity.result == "5 ")
    }

    @Test fun clearTextTest(){
        mainActivity.addText(5.toString())
        mainActivity.clearText()

        assertTrue(mainActivity.result == "")
    }

}
