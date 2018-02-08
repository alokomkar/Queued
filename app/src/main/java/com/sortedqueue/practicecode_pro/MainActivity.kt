package com.sortedqueue.practicecode_pro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sortedqueue.practicecode_pro.auth.LogoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadLogoFragment()
    }

    lateinit var handler: Handler
    lateinit var runnable: Runnable

    private var logoFragment: LogoFragment?= null
    private fun loadLogoFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        logoFragment = LogoFragment()
        fragmentTransaction.replace(container.id, logoFragment).commit()
        handler = Handler()
        runnable = Runnable {
            loadDashboardFragment()
        }
        handler.postDelayed( runnable , 2000)
    }

    private fun loadDashboardFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        logoFragment = LogoFragment()
        fragmentTransaction.replace(container.id, logoFragment).commit()
    }

    private fun loadCarousalFragment() {

    }
}
