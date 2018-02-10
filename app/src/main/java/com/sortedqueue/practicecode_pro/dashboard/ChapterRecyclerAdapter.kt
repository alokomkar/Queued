package com.sortedqueue.practicecode_pro.dashboard

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.sortedqueue.practicecode_pro.R
import com.sortedqueue.practicecode_pro.base.Chapter
import com.sortedqueue.practicecode_pro.dashboard.ChapterRecyclerAdapter.ViewHolder

/**
 * Created by Alok on 10/02/18.
 */
class ChapterRecyclerAdapter( private val chapters : ArrayList<Chapter>, val dashboardView: DashboardView  ) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val chapter = chapters[position]
        holder!!.titleTextView.text = chapter.title
        holder.subTitleTextView.text = chapter.description
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder( LayoutInflater.from(parent!!.context).inflate(R.layout.item_chapters, parent, false))
    }

    override fun getItemCount(): Int {
        return chapters.size
    }

    inner class ViewHolder( itemView : View) : RecyclerView.ViewHolder( itemView ), View.OnClickListener {
        override fun onClick(view: View?) {
            val position = adapterPosition
            if( position != -1 ) {
                dashboardView.onChapterSelected( getItem( position ) )
            }
        }

        val titleTextView = itemView.findViewById<TextView>(R.id.titleTextView)!!
        val subTitleTextView = itemView.findViewById<TextView>(R.id.subTitleTextView)!!

        init {
            itemView.setOnClickListener(this)
        }
    }

    private fun getItem(position: Int): Chapter {
        return chapters[position]
    }
}