package com.natansin.quem

import android.os.Bundle
import android.os.Looper

import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.natansin.quem.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val fabList = mutableListOf<FloatingActionButton>()
    private val random = java.util.Random()
    private val handler = android.os.Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fabList.addAll(
            listOf(
                binding.floatingActionButton1, binding.floatingActionButton2,
                binding.floatingActionButton3, binding.floatingActionButton4,
                binding.floatingActionButton5, binding.floatingActionButton6,
                binding.floatingActionButton7, binding.floatingActionButton8,
                binding.floatingActionButton9, binding.floatingActionButton10,
                binding.floatingActionButton11, binding.floatingActionButton12,
                binding.floatingActionButton13, binding.floatingActionButton14,
                binding.floatingActionButton15
            )
        )
        for (fab in fabList) {
            fab.setOnClickListener {
                hideAllFabsExceptClicked(fab)
                handler.removeCallbacksAndMessages(null)
                handler.postDelayed({ hideAllFabs() }, 5000) // 5000 milliseconds = 5 seconds
            }
        }

        binding.buttondenovo.setOnClickListener {
            showAllFabs()
        }
    }

    private fun hideAllFabsExceptClicked(clickedFab: FloatingActionButton) {
        for (fab in fabList) {
            if (fab == clickedFab) {
                fab.visibility = View.VISIBLE
            } else {
                fab.visibility = View.INVISIBLE
            }
        }
    }

    private fun hideAllFabs() {
        for (fab in fabList) {
            fab.visibility = View.INVISIBLE
        }
    }

    private fun showAllFabs() {
        for (fab in fabList) {
            fab.visibility = View.VISIBLE
        }
    }
}