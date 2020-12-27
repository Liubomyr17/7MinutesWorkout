package com.sevenminuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_exercise.*

//TODO(Step 1 - Add an ExerciseActivity.)-->
class ExerciseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        //TODO(Step 5 - Setting up the action bar using the toolbar and adding a back arrow button to it.)-->
        //START
        setSupportActionBar(toolbar_exercise_activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Us the backpressed (close the activity) functionality when clicking the toolbar back button
        toolbar_exercise_activity.setNavigationOnClickListener {
            onBackPressed()
        }
        //END
    }
}