package com.mandu.androidlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jumpToLinear(view: View) {
        startActivity(Intent(this, LinearActivity::class.java))
    }

    fun jumpToRelative(view: View) {
        startActivity(Intent(this, RelativeActivity::class.java))
    }

    fun jumpToFrame(view: View) {
        startActivity(Intent(this, FrameActivity::class.java))
    }

    fun jumpToGrid(view: View) {
        startActivity(Intent(this, GridActivity::class.java))
    }

    fun jumpToConstraint(view: View) {
        startActivity(Intent(this, ConstraintActivity::class.java))
    }
}
