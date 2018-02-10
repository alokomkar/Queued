package com.sortedqueue.practicecode_pro.codebase

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
import kotlinx.android.synthetic.main.fragment_code_base.*

/**
 * Created by Alok on 10/02/18.
 */
class CodeBaseFragment : BaseMainFragment(), CodeBaseView {

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

    override fun getCodeBaseForChapter(codeBaseList: ArrayList<CodeBase>) {
        val codeBase = codeBaseList[0]
        articleTitleTextView.text = codeBase.title
        articleDescriptionTextView.text = codeBase.description
        articleProgramRecyclerView.layoutManager = LinearLayoutManager( context )
        articleProgramRecyclerView.adapter = CodeRecyclerAdapter( codeBase.programCode, "java" )

        hideProgressDialog()
    }

    override fun onCreateView(@NonNull inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_code_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showProgressDialog(R.string.loading_content)
        CodeBasePresenter( this, arguments!!.getParcelable(SELECTED_CHAPTER) )
    }
}