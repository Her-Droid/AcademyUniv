package com.dicoding.academies.ui.developer.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.UserModel
import com.dicoding.academies.utils.UserDummy

class DetailDeveloperViewModel : ViewModel(){
    private lateinit var userId: String

    fun setSelectedUser(userId: String) {
        this.userId = userId
    }

    fun getUser(): UserModel {
        lateinit var user: UserModel
        val userEntities = UserDummy.generateDummyUser()
        for (userEntity in userEntities) {
            if (userEntity.userId == userId) {
                user = userEntity
            }
        }
        return user
    }



}