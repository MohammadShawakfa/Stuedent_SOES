package com.example.stuedent_soes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        var startButtonET = findViewById<Button>(R.id.btn_start)
        var et_nameET = findViewById<AppCompatEditText>(R.id.et_name)

        startButtonET.setOnClickListener {
            if (et_nameET.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()


            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_nameET.text.toString())
                startActivity(intent)
                finish()

            }


        }
    }
}

