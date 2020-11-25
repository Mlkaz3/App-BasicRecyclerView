package com.example.simplerecyclerview
//Credit:https://www.youtube.com/channel/UC_Fh8kvtkVPkeihBs42jGcA
//Insert & Remove Item (video):https://www.youtube.com/watch?v=XyQvoONPMng
//Insert & Remove Item (code):https://codinginflow.com/tutorials/android/simple-recyclerview-kotlin/part-3-insert-remove-items
//

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var list = generateDummyList(10)
    val adapter = ItemAdapter(list)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview:RecyclerView = findViewById(R.id.rv)

        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerview.setHasFixedSize(true)

    }

    private fun generateDummyList(size:Int): List<Item>{
        val looplist = ArrayList<Item>()

        for (i in 0 until size){
            val drawable = when (i%3){
                0-> R.drawable.ic_android_
                1-> R.drawable.ic_baseline_
                else -> R.drawable.ic_baseline
            }

            val item = Item(drawable, "Item$i")
            looplist += item
        }
        return looplist;
    }
}