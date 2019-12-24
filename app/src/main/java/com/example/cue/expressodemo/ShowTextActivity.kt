package com.example.cue.expressodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_text.*

class ShowTextActivity : AppCompatActivity() {
    val KEY_EXTRA_MESSAGE = "com.example.android.testing.espresso.basicsample.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)
        val intent = intent
        val message = intent.getStringExtra(KEY_EXTRA_MESSAGE)
        show_text_view.text = message

    }
}
