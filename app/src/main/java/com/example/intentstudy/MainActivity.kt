package com.example.intentstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        val intent = Intent(this,SecondActivity::class.java)
            .putExtra("message","This message was sent from MainActivity")

        binding.goTo2ndActivityButton.setOnClickListener {
            finish()
            startActivity(intent)
        }

    }
}