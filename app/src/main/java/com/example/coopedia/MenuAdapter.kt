package com.example.coopedia

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.coopedia.databinding.MenuItemBinding

class MenuAdapter(var contex:Context ,var menulist:MutableList<Menu>) : RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

    class MenuHolder(item : MenuItemBinding) : RecyclerView.ViewHolder(item.root){
        var name = item.name
        var price = item.price
        var card = item.card
        var  main = item.ena
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        var itemview = MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MenuHolder(itemview)
    }

    override fun getItemCount(): Int {
        return menulist.size
    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.name.text = menulist[position].name
        holder.price.text = menulist[position].price.toString()
        holder.card.setBackgroundResource(menulist[position].img)

        var anim = AnimationUtils.loadAnimation(contex,R.anim.item_anim)
        holder.main.startAnimation(anim)

    }
}