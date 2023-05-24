package com.ks.mvvmarchitecture.View

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.ks.mvvmarchitecture.ViewModel.UserViewModel


class MainActivity : ComponentActivity() {
    private val userViewModel:UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserScreen(userViewModel)
        }
    }
}


