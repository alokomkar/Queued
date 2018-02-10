package com.sortedqueue.practicecode_pro.codebase

import com.sortedqueue.practicecode_pro.base.Chapter
import com.sortedqueue.practicecode_pro.base.DataManager

/**
 * Created by Alok on 10/02/18.
 */
class CodeBasePresenter( private val codeBaseView: CodeBaseView, val chapter: Chapter ) {

    init {
        codeBaseView.getCodeBaseForChapter( DataManager().fetchCodeBaseList( chapter ) )
    }
}