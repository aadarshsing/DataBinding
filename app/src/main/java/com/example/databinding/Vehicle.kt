package com.example.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Vehicle: BaseObservable(){

    var modelYear : String = ""

    // @Bindable : used to mark properties for which data binding  library should generate code
    //to handle change notifications. it triggers automatic updates in the UI that is bound to
    // that property
    @Bindable
    var name : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }


}
