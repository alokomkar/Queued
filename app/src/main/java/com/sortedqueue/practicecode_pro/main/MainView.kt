package com.sortedqueue.practicecode_pro.main

import com.sortedqueue.practicecode_pro.base.BaseView
import com.sortedqueue.practicecode_pro.base.Chapter

/**
 * Created by Alok on 10/02/18.
 */
interface MainView : BaseView {
    fun loadLogoFragment()
    fun loadCarousalFragment()
    fun loadDashboardFragment()
    fun loadCodeBaseFragment( chapter: Chapter)
}