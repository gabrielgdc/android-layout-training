package com.example.AppLayoutTraining.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.AppLayoutTraining.Adapters.FriendsAdapter
import com.example.AppLayoutTraining.Models.Friend
import com.example.AppLayoutTraining.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val friends = ArrayList<Friend>()
        friends.add(Friend(R.drawable.avatar_showman, "Karen Stewart", "New York, USA"))
        friends.add(Friend(R.drawable.avatar_showman, "Jose Edwards", "Copenhagen, Denmark"))
        friends.add(Friend(R.drawable.avatar_showman, "Helen Berry", "Paris, France"))
        friends.add(Friend(R.drawable.avatar_showman, "Samuel Powell", "London, England"))

        val friendsList = findViewById<ListView>(R.id.friendsDashboardList)
        friendsList.adapter = FriendsAdapter(this, friends)
    }
}