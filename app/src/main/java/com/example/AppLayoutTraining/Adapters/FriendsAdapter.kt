package com.example.AppLayoutTraining.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.AppLayoutTraining.Models.Friend
import com.example.AppLayoutTraining.R

class FriendsAdapter(var context: Context, var friends: List<Friend>) : BaseAdapter() {
    override fun getCount(): Int {
        return friends.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_friend, null)
        val name = view.findViewById<TextView>(R.id.name)
        name.text = friends[p0].name

        val city = view.findViewById<TextView>(R.id.city)
        city.text = friends[p0].city

        return view
    }
}