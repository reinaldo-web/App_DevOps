package com.up.helloup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLogin.setOnClickListener { onClickOk() }

        Log.d("positivo","Testesdfsadfdsafds")

        BuildConfig.DEBUG
    }

    private fun onClickOk() {
        Toast.makeText(this,"Aula UP!" ,Toast.LENGTH_SHORT).show()
    }
}