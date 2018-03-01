package com.mengpeng.recyclerview_gallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mengpeng.recyclerviewgallery.CarouselLayoutManager
import com.mengpeng.recyclerviewgallery.CarouselZoomPostLayoutListener
import com.mengpeng.recyclerviewgallery.CenterScrollListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Int>()

        list.add(R.color.colorAccent)
        list.add(R.color.colorPrimary)
        list.add(R.color.colorAccent)
        list.add(R.color.colorPrimaryDark)
        list.add(R.color.colorAccent)
        list.add(R.color.colorPrimary)
        list.add(R.color.colorAccent)
        list.add(R.color.colorPrimaryDark)
        list.add(R.color.colorAccent)


        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())

        recyclerView.setLayoutManager(layoutManager)
        recyclerView.setHasFixedSize(true)
        recyclerView.addOnScrollListener(CenterScrollListener())
        recyclerView.setAdapter(GalleryAdapter(list, this))

    }
}
