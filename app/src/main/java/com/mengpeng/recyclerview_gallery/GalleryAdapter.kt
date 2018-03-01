package com.mengpeng.recyclerview_gallery

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import java.util.ArrayList

/**
 * 作者：MengPeng
 * 时间：2018/3/1 - 下午6:41
 * 说明：
 */
open class GalleryAdapter(list: ArrayList<Int>, context: Context) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    private var list: List<Int>? = list
    private var context: Context? = context


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val color = ContextCompat.getColor(this!!.context!!, list!!.get(position))
        if (holder != null) {
            holder.list_item_image.setBackgroundColor(color)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val list_item_image: ImageView

        init {
            list_item_image = itemView.findViewById(R.id.list_item_image)
        }
    }
}