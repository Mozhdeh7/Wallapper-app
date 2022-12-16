package com.moj.mywallpaper.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.moj.mywallpaper.Adapter.RecyclerViewAdapter
import com.moj.mywallpaper.R
import com.moj.mywallpaper.Services.DataService
import com.moj.mywallpaper.Utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCatList = findViewById<RecyclerView>(R.id.myRecyclerView)

        categoryAdapter = RecyclerViewAdapter(this, DataService.categories) { category ->
            //Toast.makeText(this, category.name, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.name)
            startActivity(intent)
        }

        myCatList.adapter = categoryAdapter
        val layoutManager = LinearLayoutManager(this)
        myCatList.layoutManager = layoutManager

        myCatList.setHasFixedSize(true)

    }
}