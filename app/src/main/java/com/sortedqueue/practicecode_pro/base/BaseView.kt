package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 07/02/18.
 */
interface BaseView {
    fun showProgressDialog( message : Int )
    fun hideProgressDialog()
    fun showError( message : Int )
    fun showError( errorMessage : String )
}