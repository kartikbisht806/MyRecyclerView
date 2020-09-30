package com.xxluciferinxx.myrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val array = ArrayList<CustomArr>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateArray()

        rv_recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyRecyclerAdapter(array)
        }
    }

    private fun populateArray() {
        array.add(CustomArr("recycler1", R.drawable.troll))
        array.add(CustomArr("recycler2", R.drawable.troll))
        array.add(CustomArr("recycler3", R.drawable.troll))
        array.add(CustomArr("recycler4", R.drawable.troll))
        array.add(CustomArr("recycler5", R.drawable.troll))
    }
}