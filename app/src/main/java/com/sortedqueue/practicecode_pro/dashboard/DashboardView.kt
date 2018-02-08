package com.sortedqueue.practicecode_pro.dashboard

import com.sortedqueue.practicecode_pro.base.BaseView
import com.sortedqueue.practicecode_pro.base.Chapter
import com.sortedqueue.practicecode_pro.base.CodeBase

/**
 * Created by Alok on 08/02/18.
 */
interface DashboardView : BaseView {

    fun getLanguage() : Int
    fun retrieveChapters( chapters : ArrayList<Chapter> )
    fun getCodeBaseForChapter( codeBaseList : ArrayList<CodeBase> )
    fun onChapterSelected( chapter: Chapter )
    fun getSelectedChapter() : Chapter

}