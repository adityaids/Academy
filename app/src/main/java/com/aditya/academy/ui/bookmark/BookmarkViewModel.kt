package com.aditya.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.aditya.academy.data.CourseEntity
import com.aditya.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}