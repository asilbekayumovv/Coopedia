package com.example.coopedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coopedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menulist = mutableListOf<Menu>()

        for (i in 1..30) {
            menulist.add(Menu("Burger", 15.2f, R.drawable.burger))
            menulist.add(Menu("Pizza", 45.2f, R.drawable.pizza))
            menulist.add(Menu("Shashlik", 15048f, R.drawable.shashlu))
        }


        val adapter = MenuAdapter(this,menulist)
        val manager = GridLayoutManager(this,2, RecyclerView.VERTICAL,false)

        binding.menu.adapter = adapter
        binding.menu.layoutManager = manager


    }
}