package com.sortedqueue.practicecode_pro.codebase

import com.sortedqueue.practicecode_pro.base.BaseView
import com.sortedqueue.practicecode_pro.base.CodeBase

/**
 * Created by Alok on 10/02/18.
 */
interface CodeBaseView : BaseView {
    fun getCodeBaseForChapter( codeBaseList : ArrayList<CodeBase> )
}