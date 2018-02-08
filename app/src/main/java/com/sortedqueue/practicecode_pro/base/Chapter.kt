package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 07/02/18.
 */
class Chapter( var chapterId : String = "",
               var programLanguage : Int = LANGUAGE_JAVA,
               var title : String = "",
               var description : String = "",
               var imageUrl : String = "",
               var isPaid : Boolean = false ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Chapter

        if (chapterId != other.chapterId) return false

        return true
    }

    override fun hashCode(): Int {
        return chapterId.hashCode()
    }
}