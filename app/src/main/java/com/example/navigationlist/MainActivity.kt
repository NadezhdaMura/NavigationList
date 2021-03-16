package com.example.navigationlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.navigationlist.ui.CatFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = HomeFragment()
        val infoFragment = InfoFragment()
        val animationFragment = AnimationFragment()
        val catFragment = CatFragment()


        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home ->makeCurrentFragment(homeFragment)
                R.id.ic_info ->makeCurrentFragment(infoFragment)
                R.id.ic_animation ->makeCurrentFragment(animationFragment)
                R.id.ic_cat ->makeCurrentFragment(catFragment)


            }
            true
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainer,fragment)
                .commit()
        }

}
