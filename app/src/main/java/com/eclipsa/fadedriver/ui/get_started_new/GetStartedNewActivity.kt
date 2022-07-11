package com.eclipsa.fadedriver.ui.get_started_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eclipsa.fadedriver.databinding.ActivityGetStartedNewBinding
import com.eclipsa.fadedriver.ui.get_started.GetStartedActivity

class GetStartedNewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetStartedNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGetStartedNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.relGetStarted.setOnClickListener {
            startActivity(Intent(this, GetStartedActivity::class.java))
            finish()
        }
    }
}