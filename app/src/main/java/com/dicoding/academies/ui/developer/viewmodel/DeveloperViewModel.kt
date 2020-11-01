package com.dicoding.academies.ui.developer.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.UserModel
import com.dicoding.academies.utils.UserDummy

class DeveloperViewModel : ViewModel(){

    fun getUser(): List<UserModel> = UserDummy.generateDummyUser()
}