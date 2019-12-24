package com.example.cue.expressodemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val KEY_EXTRA_MESSAGE = "com.example.android.testing.espresso.basicsample.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set the listeners for the buttons.
       changeTextBt.setOnClickListener(this)
        activityChangeTextBtn.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val text = editTextUserInput.text.toString()
        val changeTextBtdId = R.id.changeTextBt
        val activityChangeTextBtnId = R.id.activityChangeTextBtn
        if(view?.id == changeTextBtdId) {
           textToBeChanged.text = text

        } else {
            val newIntent = Intent(MainActivity@this, ShowTextActivity::class.java)
            newIntent.putExtra(KEY_EXTRA_MESSAGE, text)
            startActivity(newIntent)
        }

    }
}
