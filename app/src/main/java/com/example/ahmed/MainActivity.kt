package com.example.ahmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var Location : EditText
    lateinit var mobile : EditText
    lateinit var toas : Button
    lateinit var tvbt : Button
    lateinit var go : Button
    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.ednam)
        Location = findViewById(R.id.edloc)
        mobile = findViewById(R.id.edmob)
        tv = findViewById(R.id.tv)

        toas = findViewById(R.id.toa)
        tvbt = findViewById(R.id.tvbtn)
        go = findViewById(R.id.gobtn)

        toas.setOnClickListener {
            Toast.makeText(applicationContext,
                "${name.text}  \n  ${Location.text} \n  ${mobile.text} ",
                Toast.LENGTH_SHORT).show()
        }

        tvbt.setOnClickListener {
            tv.text = "${name.text} \n " +
                    " ${Location.text} \n " +
                    " ${mobile.text}"
        }

        go.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name",name.text)
            intent.putExtra("location",Location.text)
            intent.putExtra("mobile",mobile.text)
            startActivity(intent)

        }




    }
}