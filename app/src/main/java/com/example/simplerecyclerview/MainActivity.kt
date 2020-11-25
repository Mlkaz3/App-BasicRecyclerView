package com.example.simplerecyclerview
//Credit:https://www.youtube.com/channel/UC_Fh8kvtkVPkeihBs42jGcA
//Insert & Remove Item :https://www.youtube.com/watch?v=XyQvoONPMng
//
//

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview:RecyclerView = findViewById(R.id.rv)

        val list = generateDummyList(10)
        recyclerview.adapter = ItemAdapter(list)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerview.setHasFixedSize(true)

    }

    private fun generateDummyList(size:Int): List<Item>{
        val list = ArrayList<Item>()

        for (i in 0 until size){
            val drawable = when (i%3){
                0-> R.drawable.ic_android_
                1-> R.drawable.ic_baseline_
                else -> R.drawable.ic_baseline
            }

            val item = Item(drawable, "Item$i")
            list += item
        }
        return list;
    }
}