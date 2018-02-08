package com.sortedqueue.practicecode_pro.base

import android.content.Context
import android.view.View
import android.widget.Toast

/**
 * Created by Alok on 08/02/18.
 */

fun View?.show() {
    if( this != null )
        this.visibility = View.VISIBLE
}

fun View?.hide() {
    if( this != null )
    this.visibility = View.GONE
}

fun View?.invisible() {
    if( this != null )
        this.visibility = View.INVISIBLE
}

fun View?.isVisible() : Boolean {
    return this != null && this.visibility == View.VISIBLE
}

fun Context.showToast( message : Int ) {
    Toast.makeText( this, message, Toast.LENGTH_SHORT ).show()
}

fun Context.showToast( message : String ) {
    Toast.makeText( this, message, Toast.LENGTH_SHORT ).show()
}