package com.sevenminuteworkout

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Variable for Timer which will be initialized later
    private var countDownTimer: CountDownTimer? = null
    // The duration of the timer in milliseconds
    private var timeDuration: Long = 60000
    // pauseOffset = timeDuration - time left
    private var pauseOffset: Long = 0


    /**
     * This method is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        tvTimer.text = "${(timeDuration/1000).toString()}"
        btnStart.setOnClickListener {
            startTimer(pauseOffset)
        }
        btnPause.setOnClickListener {
            pauseTimer()
        }
        btnStop.setOnClickListener {
            resetTimer()
        }

        // Click event for start Button which we have created in XML.
        llStart.setOnClickListener {
            //TODO(Step 11 - On Start button click navigate it to the Exercise Activity.)
            //START
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
            //END
        }
        private fun startTimer(pauseOffsetL: Long) {
            countDownTimer = object : CountDownTimer(timerDuration - pauseOffsetL, 1000) {
                override fun onTick(millisUnitFinished: Long) {
                    pauseOffset = timerDuration - millisUnitFinished
                    tvTimer.text = (millisUnitFinished / 1000).toString()
                    TODO("Not yet implemented")
                }
                override fun onFinish() {
                    Toast.makeText(this@MainActivity, "Timer is finished", Toast.LENGTH_SHORT).show()
                }
            }.start()
        }
        private fun pauseTimer() {
            if (countDownTimer != null) {
                countDownTimer!!.cancel()
            }
        }
        private fun resetTimer() {}
        if(countDownTimer!!.cancel()
                cuntDownTimer!!.cencel()
            tvTimer.text = ${(timerDuaration/1000).toString()}
        countDownTimer = null
        pauseOffsetOffSet = 0
    }
}