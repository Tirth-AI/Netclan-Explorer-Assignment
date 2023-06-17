package com.example.netclanexplorerassignment.Activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.netclanexplorerassignment.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var binding: ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinnerList1 = ArrayList<String>()

        spinnerList1.add(0, "Available | Hey Let Us Connect")
        spinnerList1.add("Away | Stay Discreet And Watch")
        spinnerList1.add("Busy | Do Not Disturb | will Catch Up Later")
        spinnerList1.add("SOS | Emergency! Need Assistance! HELP")


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,
            spinnerList1)
        binding.spinnerAvailability.adapter = adapter

        binding.btnBusiness.setOnClickListener {
            binding.btnBusiness.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnBusiness.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnCoffee.setOnClickListener {
            binding.btnCoffee.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnCoffee.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnDating.setOnClickListener {
            binding.btnDating.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnDating.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnDinning.setOnClickListener {
            binding.btnDinning.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnDinning.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnFriendship.setOnClickListener {
            binding.btnFriendship.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnFriendship.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnHobbies.setOnClickListener {
            binding.btnHobbies.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnHobbies.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnMatrimony.setOnClickListener {
            binding.btnMatrimony.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnMatrimony.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.btnMovies.setOnClickListener {
            binding.btnMovies.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnMovies.setBackgroundColor(Color.parseColor("#143D59"))
        }

        binding.ivBtnBack.setOnClickListener {
            finish()
        }
    }
}