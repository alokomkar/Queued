package com.sortedqueue.practicecode_pro.codebase

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sortedqueue.practicecode_pro.R
import io.github.kbiakov.codeview.CodeView
import io.github.kbiakov.codeview.adapters.Options
import io.github.kbiakov.codeview.highlight.ColorTheme

/**
 * Created by Alok on 10/02/18.
 */
class CodeRecyclerAdapter( val code : String, val language : String ) : RecyclerView.Adapter<CodeRecyclerAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.codeView.setOptions(Options.Default.get(holder.itemView.context)
                .withLanguage(language)
                .withCode( code )
                .withTheme(ColorTheme.SOLARIZED_LIGHT))
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder( LayoutInflater.from(parent!!.context).inflate(R.layout.item_code_view, parent, false))
    }

    override fun getItemCount(): Int {
        return 1
    }

    inner class ViewHolder( itemView : View) : RecyclerView.ViewHolder( itemView ) {
        val codeView = itemView.findViewById<CodeView>(R.id.codeView)!!
    }

}