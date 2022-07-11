package com.eclipsa.fadedriver.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eclipsa.fadedriver.R
import com.eclipsa.fadedriver.databinding.ActivityWelComeBinding
import com.eclipsa.fadedriver.ui.login.LoginActivity

class WelComeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityWelComeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelComeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
    }

    private fun setClickListeners() {
        binding.tvLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tvLogin -> {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
    }
}