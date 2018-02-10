package com.sortedqueue.practicecode_pro.main

import android.content.Context
import android.support.v4.app.Fragment

/**
 * Created by Alok on 10/02/18.
 */
abstract class BaseMainFragment : Fragment() {

    lateinit var mMainView : MainView

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if( context is MainView )
            mMainView = context
    }

}