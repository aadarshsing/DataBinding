package com.example.databinding

import android.content.Context
import android.view.View
import android.widget.Toast

class VehicleClickHandler(var context: Context) {


    fun displayToast(view : View){
        Toast.makeText(context,"you clicked the button", Toast.LENGTH_SHORT).show()
    }
}