package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //where we've connected .kt file to .xml

        // User can tap button to change the text color of a label
            // Add a button

                //Get reference to button
            findViewById<Button>(R.id.button2).setOnClickListener {
                // Set up logic to know when user has tapped button
                // Change the color of the text WHEN user tapped button
                Log.i("Jeff", "Tapped on button")
                //Get reference to text view
                //Set color of text view
                findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.sea_green))
            }


    }
}