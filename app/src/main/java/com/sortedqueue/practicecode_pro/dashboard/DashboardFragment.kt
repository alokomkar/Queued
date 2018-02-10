package com.sortedqueue.practicecode_pro.dashboard

import android.os.Bundle
import android.support.annotation.NonNull
import android.support.annotation.Nullable
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sortedqueue.practicecode_pro.R
import com.sortedqueue.practicecode_pro.base.*
import com.sortedqueue.practicecode_pro.main.BaseMainFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

/**
 * Created by Alok on 08/02/18.
 */
class DashboardFragment : BaseMainFragment(), DashboardView {

    private var mSelectedChapter : Chapter ?= null
    private lateinit var mDashboardPresenter : DashboardPresenter

    override fun getSelectedChapter(): Chapter {
        return mSelectedChapter!!
    }

    override fun showProgressDialog(message: Int) {
        progressLayout.show()
    }

    override fun hideProgressDialog() {
        progressLayout.hide()
    }

    override fun showError(message: Int) {
        if( context != null )
            context!!.showToast(message)
    }

    override fun showError(errorMessage: String) {
        if( context != null )
            context!!.showToast(errorMessage)
    }

    override fun getLanguage(): Int {
        return LANGUAGE_JAVA
    }

    override fun retrieveChapters(chapters: ArrayList<Chapter>) {
        chaptersRecyclerView.layoutManager = LinearLayoutManager( context )
        chaptersRecyclerView.adapter = ChapterRecyclerAdapter( chapters, this )
    }

    override fun getCodeBaseForChapter(codeBaseList: ArrayList<CodeBase>) {
        
    }

    override fun onChapterSelected(chapter: Chapter) {
        mSelectedChapter = chapter
    }

    override fun onCreateView(@NonNull inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mDashboardPresenter = DashboardPresenter(this)
    }
}