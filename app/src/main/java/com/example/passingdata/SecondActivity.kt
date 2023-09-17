package com.example.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passingdata.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding) {
            dataUsername.text = name
            dataEmail.text = email
            dataPhone.text = phone
        }
    }
}