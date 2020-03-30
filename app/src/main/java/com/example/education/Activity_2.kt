package com.example.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.education.Product

class Activity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val name_show : TextView = findViewById(R.id.name_show)
        val age_show : TextView = findViewById(R.id.age_show)

        val bundle : Bundle? = intent.extras

        var message  = bundle!!.get(activity_1.GO) as Product

        name_show.setText(message.name.toString())
        age_show.setText(message.age.toString())



    }


}
