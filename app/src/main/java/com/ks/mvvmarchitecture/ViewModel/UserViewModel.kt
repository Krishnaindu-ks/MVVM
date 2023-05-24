package com.ks.mvvmarchitecture.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ks.mvvmarchitecture.Model.User

class UserViewModel:ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    init {
        _user.value = User(1,"Krishna","krishna@gmail.com")
    }
     fun updateUserName(newName:String){
         val currentUser = user.value?:return
         _user.value=currentUser.copy(name = newName)
     }
}