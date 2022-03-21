package com.als.gblesson2

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.als.gblesson2.databinding.ActivityMainBinding
import com.als.gblesson2.expiriment.MainBroadCastReceiver
import com.als.gblesson2.expiriment.ThreadsFragment
import com.als.gblesson2.view.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val receiver = MainBroadCastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            openFragment(MainFragment.newInstance())
//            openFragment(ThreadsFragment.newInstance())
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}