package com.sortedqueue.practicecode_pro.dashboard

import com.sortedqueue.practicecode_pro.base.DataManager

/**
 * Created by Alok on 08/02/18.
 */
class DashboardPresenter( val dashboardView : DashboardView ) {

    private val dataManager : DataManager = DataManager()

    init {
        fetchChapters()
    }

    private fun fetchChapters() {

    }

}