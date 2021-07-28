package com.jojob.mysololife.contensList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jojob.mysololife.R

class ContentsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents_list)

        val rv : RecyclerView = findViewById(R.id.recyclerView)

        val items = ArrayList<String>()

        items.add("a")
        items.add("b")
        items.add("c")

        val rvAdapter = ContentsRVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

    }
}