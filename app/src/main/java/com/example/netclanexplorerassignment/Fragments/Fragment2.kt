package com.example.netclanexplorerassignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorerassignment.Adapters.PersonContactAdapter2
import com.example.netclanexplorerassignment.R
import com.example.netclanexplorerassignment.DataModel.UserDetails


class Fragment2 : Fragment() {
    private lateinit var fragment2: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragment2 =  inflater.inflate(R.layout.fragment_2, container, false)

        val usersList2 = ArrayList<UserDetails>()

        usersList2.add(
            UserDetails("Tirth", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Riya", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Abhir", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Prineeta", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Dhiren", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Tirth", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Balram", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Ram", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList2.add(
            UserDetails("Sanjay", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        val recyclerView2: RecyclerView = fragment2.findViewById(R.id.recyclerView2)
        val mAdapter2 = PersonContactAdapter2(usersList2)
        recyclerView2.adapter = mAdapter2
        return fragment2
    }
}