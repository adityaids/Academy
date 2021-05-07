package com.aditya.academy.ui.bookmark

import com.aditya.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
