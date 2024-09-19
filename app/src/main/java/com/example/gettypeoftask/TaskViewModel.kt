package com.example.gettypeoftask

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel: ViewModel() {
    val isBigTask = MutableLiveData<Boolean>()
}