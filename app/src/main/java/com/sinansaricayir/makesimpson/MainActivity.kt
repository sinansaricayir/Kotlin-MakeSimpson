package com.sinansaricayir.makesimpson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun makePerson(view : View){

        name = nameText.text.toString()

        val job = jobText.text.toString()

        var age = ageText.text.toString().toIntOrNull()
        if(age ==null){
            age=0
        }
        val person = Person(name,job,age)

        resultText.text = " İsim : ${person.name} Mesleği : ${person.job} Yaşı : ${person.age}"


    }

    fun scopeExample(view : View){
        //scope
        println(name)
    }
}