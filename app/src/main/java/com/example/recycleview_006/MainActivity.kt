package com.example.recycleview_006

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recycleView : RecyclerView? = null
    var foodMenuText = arrayOf(
        "Rose",
        "Sun Flower",
        "Jasmine",
        "Dasie",
        "Gerbera",
        "Carnation",
        "Bauhinia",
        "Anemone",
        "Azalea",
        "Dahlia",
        "flame tree",
        "Freesia",
        "Gypsophila"
    )
    var foodMenuImage = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13
    )
    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.menuRecycleview) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2 ))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.adapter = myAdapter

    }
}
