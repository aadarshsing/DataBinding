package com.example.databinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import  android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        //use DataBinding to set the Content
        //View with Data Binding
        binding = DataBindingUtil.setContentView(
            this,R.layout.activity_main
        )

        //Accessing Binding Views
        var v1 = Vehicle()
        v1.name = "BMW"
         v1.modelYear = "2002"
        binding.myVehile = v1
//        binding.txt.text = v1.name

        //Handling the click event
//        binding.button.setOnClickListener {
//            Toast.makeText(this,"you clicked the button",Toast.LENGTH_SHORT).show()
//        }
        binding.clickHandler = VehicleClickHandler(this)

        //Two way binding




    }
}