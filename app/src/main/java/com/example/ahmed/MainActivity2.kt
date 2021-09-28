package com.example.ahmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv2 : TextView
    lateinit var back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
// they are tow way to receive the value this the first way
        var str1 = intent.extras?.get("name")
        var str2 = intent.extras?.get("location")
        var str3 = intent.extras?.get("mobile")
    // this the second way
    //val name = intent.getStringExtra("Name")

        tv2=findViewById(R.id.txt2)
        tv2.text = "$str1 \n $str2 \n $str3"

        back = findViewById(R.id.backbtn)
        back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}