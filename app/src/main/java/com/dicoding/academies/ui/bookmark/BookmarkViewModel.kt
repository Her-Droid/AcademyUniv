package com.dicoding.academies.ui.bookmark

import androidx.lifecycle.ViewModel

import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.DataModule
import com.dicoding.academies.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<DataModule> = DataDummy.generateDummyDataModule()
}

