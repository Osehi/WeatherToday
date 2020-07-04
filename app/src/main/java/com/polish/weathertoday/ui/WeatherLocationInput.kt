package com.polish.weathertoday.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.polish.weathertoday.R

/**
 * A simple [Fragment] subclass.
 */
class WeatherLocationInput : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_location_input, container, false)
    }

}
