package com.sevenminuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*

//TODO(Step 1 : Created a Finish Screen.)
//START
class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //TODO(Step 4 : Setting the action bar with the toolbar added in the activity layout and adding a back arrow button and its click event.)
        //START
        setSupportActionBar(toolbar_finish_activity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar_finish_activity.setNavigationOnClickListener {
            onBackPressed()
        }
        //END

        //TODO(Step 5 : Adding a click event to the Finish Button.)
        //START
        btnFinish.setOnClickListener {
            finish()
        }
        //END
    }
}
//END