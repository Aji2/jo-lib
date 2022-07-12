package com.src.blinklib

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.src.blinklib.databinding.ActivityMainBinding
import com.src.jo_blink.Toaster


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.button.setOnClickListener(View.OnClickListener {
            binding.text.setText( Toaster.setToaster("heartly love "))
        })

    }
}