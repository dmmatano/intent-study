package com.example.intentstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentstudy.databinding.ActivityMainBinding
import com.example.intentstudy.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        message = intent?.extras?.getString("message").toString()

    }

    override fun onStart() {
        super.onStart()

        val intent = Intent(this,MainActivity::class.java)

        with(binding){

            messageTextView.text = message

            goToMainActivityButton.setOnClickListener {
                finish()
                startActivity(intent)
            }
        }


    }


}