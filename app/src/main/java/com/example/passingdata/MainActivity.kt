package com.example.passingdata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.passingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnRegister.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra(EXTRA_NAME, inpUsername.text.toString())
                intentToSecondActivity.putExtra(EXTRA_EMAIL, inpEmail.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PHONE, inpTelp.text.toString())
                startActivity(intentToSecondActivity)
            }
            keLogin.setOnClickListener {
                val intentToLogin =
                    Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intentToLogin)
            }
            google.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com")
                startActivity(intent)
            }
            instagram.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.instagram.com/")
                startActivity(intent)
            }
            thereads.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.threads.net/")
                startActivity(intent)
            }
        }

        Log.d(TAG, "onCreate: dipanggil")
    }
}