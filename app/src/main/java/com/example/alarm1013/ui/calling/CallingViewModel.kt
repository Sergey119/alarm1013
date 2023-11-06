package com.example.alarm1013.ui.calling

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CallingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is calling Fragment"
    }
    val text: LiveData<String> = _text
}