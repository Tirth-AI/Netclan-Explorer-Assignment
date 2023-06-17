package com.example.netclanexplorerassignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorerassignment.Adapters.PersonContactAdapter3
import com.example.netclanexplorerassignment.R
import com.example.netclanexplorerassignment.DataModel.UserDetails

class Fragment3 : Fragment() {
    private lateinit var fragment3: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragment3 =  inflater.inflate(R.layout.fragment_3, container, false)

        val usersList = ArrayList<UserDetails>()

        val usersList3 = ArrayList<UserDetails>()

        usersList3.add(
            UserDetails("Tirth", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Ram", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Shyam", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Balram", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Tejas", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Mehak", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Pari", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Sanjay", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )

        usersList3.add(
            UserDetails("Rajesh", "Within 100m", "Dance | Music | Technology", "New Delhi",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu augue tristique, fermentum purus at, aliquam purus. Integer molestie fringilla" +
                    " dui eu commodo.", 50)
        )


        val recyclerView3: RecyclerView = fragment3.findViewById(R.id.recyclerView3)
        val mAdapter3 = PersonContactAdapter3(usersList3)
        recyclerView3.adapter = mAdapter3
//        mAdapter3.updateList(usersList)
        return fragment3
    }
}