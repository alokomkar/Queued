package com.sortedqueue.practicecode_pro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sortedqueue.practicecode_pro.auth.LogoFragment
import com.sortedqueue.practicecode_pro.base.Chapter
import com.sortedqueue.practicecode_pro.main.MainView
import com.sortedqueue.practicecode_pro.dashboard.DashboardFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    override fun showProgressDialog(message: Int) {

    }

    override fun hideProgressDialog() {

    }

    override fun showError(message: Int) {

    }

    override fun loadCodeBaseFragment(chapter: Chapter) {

    }

    override fun showError(errorMessage: String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadLogoFragment()
    }

    lateinit var handler: Handler
    lateinit var runnable: Runnable

    private var logoFragment: LogoFragment?= null
    override fun loadLogoFragment() {
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

    private var dashboardFragment : DashboardFragment ?= null
    override fun loadDashboardFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        dashboardFragment = DashboardFragment()
        fragmentTransaction.replace(container.id, dashboardFragment).commit()
    }

    override fun loadCarousalFragment() {

    }

    override fun onBackPressed() {
        if( supportFragmentManager.backStackEntryCount > 1 ) {
            supportFragmentManager.popBackStack()
        }
        else
            finish()
    }
}
