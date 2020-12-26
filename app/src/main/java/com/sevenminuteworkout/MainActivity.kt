package com.sevenminuteworkout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * This method is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This calls the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_main)

        //TODO(Step 6 - Adding a click event to the start button that we have created.)
        //START
        // Click event for start Button which we have created in XML.
        llStart.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Here we will start the exercise.",
                Toast.LENGTH_SHORT
            ).show()
        }
        // END
    }
}