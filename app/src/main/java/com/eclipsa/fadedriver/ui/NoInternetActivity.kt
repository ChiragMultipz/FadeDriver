package com.eclipsa.fadedriver.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eclipsa.fadedriver.R
import com.eclipsa.fadedriver.databinding.ActivityNoInternetBinding
import com.eclipsa.fadedriver.extension.visible
import com.eclipsa.fadedriver.utils.Utils
import com.eclipsa.fadedriver.utils.Utils.toast

class NoInternetActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityNoInternetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoInternetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickListener()
    }

    private fun onClickListener() {
        binding.tvTryAgain.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvTryAgain ->{
                if (Utils.isConnected(this)){
                    finish()
                } else {
                    toast("No Internet Connection!")
                }
            }
        }
    }
}