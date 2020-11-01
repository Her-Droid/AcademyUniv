package com.dicoding.academies.ui.detail

import androidx.lifecycle.ViewModel

import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.DataModule
import com.dicoding.academies.data.ModuleEntity
import com.dicoding.academies.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedData(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModule(): DataModule {
        lateinit var module: DataModule
        val moduleEntities = DataDummy.generateDummyDataModule()
        for (moduleEntity in moduleEntities) {
            if (moduleEntity.dataModuleId == courseId) {
                module = moduleEntity
            }
        }
        return module
    }

   fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}


