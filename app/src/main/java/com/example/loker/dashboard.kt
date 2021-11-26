package com.example.loker

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class dashboard : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId){

                R.id.nav_home ->  Toast.makeText(applicationContext, "clicked home",Toast.LENGTH_SHORT).show()
                R.id.nav_chat ->  Toast.makeText(applicationContext, "clicked chat",Toast.LENGTH_SHORT).show()
                R.id.nav_teams ->  Toast.makeText(applicationContext, "clicked teams",Toast.LENGTH_SHORT).show()
                R.id.nav_setting ->  Toast.makeText(applicationContext, "clicked settings",Toast.LENGTH_SHORT).show()
                R.id.nav_policy -> Toast.makeText(applicationContext, "clicked policy",Toast.LENGTH_SHORT).show()
                R.id.nav_login -> Toast.makeText(applicationContext, "clicked login",Toast.LENGTH_SHORT).show()
                R.id.nav_share -> Toast.makeText(applicationContext, "clicked share",Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment, title : String){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.relative,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){

            return true

        }


        return super.onOptionsItemSelected(item)
    }
}