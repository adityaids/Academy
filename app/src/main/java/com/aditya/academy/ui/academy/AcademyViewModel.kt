package com.aditya.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.aditya.academy.data.CourseEntity
import com.aditya.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}