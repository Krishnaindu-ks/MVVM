package com.ks.mvvmarchitecture.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ks.mvvmarchitecture.ViewModel.UserViewModel

@Composable
fun UserScreen(userViewModel: UserViewModel){
    val user = userViewModel.user.observeAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "User Details", fontSize = 20.sp)
        Text(text = "ID: ${user.value?.id}", fontSize = 20.sp)
        Text(text = "Name: ${user.value?.name}", fontSize = 20.sp)
        Text(text = "Email: ${user.value?.email}", fontSize = 20.sp)
        Button(
            onClick = { userViewModel.updateUserName("New Name")},
            modifier = Modifier.padding(top = 16.dp)
        ){
            Text(text = "Update Name", fontSize = 20.sp)
        }

    }
}