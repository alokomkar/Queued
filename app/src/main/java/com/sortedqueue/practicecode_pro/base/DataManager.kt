package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 08/02/18.
 */
class DataManager {

    private val mChaptersList : ArrayList<Chapter> = ArrayList()
    init {
        var chapterIndex = 1
        var chapterId = "Chapter_" + chapterIndex++
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Introduction", "Legend of Java" ))
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Getting started", "Behold the mighty IDE" ))
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Data Types", "Primitive ones vs Non primitive ones" ) )
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Classes and Objects", "Creating objects by mapping real world information" ) )
    }

    fun fetchChaptersList() : ArrayList<Chapter> {
        return mChaptersList
    }


}