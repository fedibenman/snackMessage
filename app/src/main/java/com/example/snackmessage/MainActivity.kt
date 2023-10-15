package com.example.snackmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var  buttonshow:Button
    lateinit var  mylayout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonshow = findViewById(R.id.btshowtoast)
        mylayout =findViewById(R.id.mylayout)
        buttonshow.setText("show Snack Bar")
        buttonshow.setOnClickListener{
            Snackbar.make(mylayout,
                "This is a snack message",
                Snackbar.LENGTH_INDEFINITE).setAction("Close",View.OnClickListener{}
            ).show()
    }
}
}