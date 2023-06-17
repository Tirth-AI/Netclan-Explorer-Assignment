package com.example.netclanexplorerassignment.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorerassignment.Adapters.PersonContactAdapter1
import com.example.netclanexplorerassignment.R
import com.example.netclanexplorerassignment.DataModel.UserDetails

class Fragment1 : Fragment() {
    private lateinit var fragment1: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragment1 =  inflater.inflate(R.layout.fragment_1, container, false)
        val usersList1 = ArrayList<UserDetails>()

        usersList1.add(
            UserDetails("Tirth", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Ramu", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Tarun", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Yash", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Pallavi", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Ananya", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Ritu", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Shyam", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList1.add(
            UserDetails("Monu", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        Log.d("Debug", "UserList Created")
        Log.d("Debug", "${usersList1.size}")
        val recyclerView1: RecyclerView = fragment1.findViewById(R.id.recyclerView1)
        val mAdapter1 = PersonContactAdapter1(usersList1)
        recyclerView1.adapter = mAdapter1
        return fragment1
    }
}