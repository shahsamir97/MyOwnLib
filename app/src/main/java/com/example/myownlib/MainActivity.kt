package com.example.myownlib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.sharetrip.flight.booking.FlightBookingActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, FlightBookingActivity::class.java)
        startActivity(intent)
    }
}