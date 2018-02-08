package com.sortedqueue.practicecode_pro.auth

import android.os.Bundle
import android.support.annotation.NonNull
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sortedqueue.practicecode_pro.R

/**
 * Created by Alok on 07/02/18.
 */
class LogoFragment : Fragment() {

    override fun onCreateView(@NonNull inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_logo, container, false)
        return view
    }

}