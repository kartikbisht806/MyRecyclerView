package com.xxluciferinxx.myrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr = arrayOf<CustomArr>(
            CustomArr("recycler1", R.drawable.troll),
            CustomArr("recycler2", R.drawable.troll),
            CustomArr("recycler3", R.drawable.troll),
            CustomArr("recycler4", R.drawable.troll)
        )

        rv_recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyRecyclerAdapter(arr)
        }
    }
}