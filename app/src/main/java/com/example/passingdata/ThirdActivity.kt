package com.example.passingdata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.passingdata.databinding.ActivityMainBinding
import com.example.passingdata.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_third)
        setContentView(binding.root)
        with(binding) {
            keRegistrasi.setOnClickListener {
                val intentToRegistrasi =
                    Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(intentToRegistrasi)
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