package com.sevenminuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_history.*

// TODO(Step 2 : Adding the History Screen Activity.)
// START
class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        // TODO(Step 5 : Setting up the action bar in the History Screen Activity and adding a back arrow button and click event for it.)
        // START
        setSupportActionBar(toolbar_history_activity)

        val actionbar = supportActionBar //actionbar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true) //set back button
            actionbar.title = "HISTORY" // Setting a title in the action bar.
        }

        toolbar_history_activity.setNavigationOnClickListener {
            onBackPressed()
        }
        // END
    }
}
// END