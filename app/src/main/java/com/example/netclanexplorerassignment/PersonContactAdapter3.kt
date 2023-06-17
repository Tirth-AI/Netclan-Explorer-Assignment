package com.example.netclanexplorerassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonContactAdapter3(private val items: ArrayList<UserDetails>) : RecyclerView.Adapter<ContactViewHolder3>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder3 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_contact, parent, false)
        return ContactViewHolder3(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder3, position: Int) {
        val currentItem = items[position]
        holder.aboutPerson.text = currentItem.aboutPerson
        holder.distance.text = currentItem.distance
        holder.interest.text = currentItem.interest
        holder.userName.text = currentItem.userName
        holder.location.text = currentItem.location
        holder.progressBar.progress = currentItem.progress
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ContactViewHolder3(itemView: View): RecyclerView.ViewHolder(itemView){
    val userName: TextView = itemView.findViewById(R.id.tv_Username)
    val location: TextView = itemView.findViewById(R.id.tv_Location)
    val aboutPerson: TextView = itemView.findViewById(R.id.tv_AboutPerson)
    val distance: TextView = itemView.findViewById(R.id.tv_Distance)
    val interest: TextView = itemView.findViewById(R.id.tv_Interest)
    val progressBar: ProgressBar = itemView.findViewById(R.id.ProgressBar)
}
