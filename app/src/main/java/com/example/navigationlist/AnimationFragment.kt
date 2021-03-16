package com.example.navigationlist

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_animation.*

class AnimationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_animation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        shuffle.setOnClickListener {
            ObjectAnimator.ofFloat(view1, "translationX", -500f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view6, "translationY", 1500f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view4,"translationY",-1500f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view3,"translationX",500f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view5,"translationX",1000f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view2,"translationY",-1800f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view7, "translationX", -500f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view12, "translationY", 1500f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view10,"translationY",-1500f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view9,"translationX",500f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view11,"translationX",1000f).apply {
                duration = 2000
                start() }
            ObjectAnimator.ofFloat(view8,"translationY",-1800f).apply {
                duration = 2000
                start() }


        }

        refresh.setOnClickListener {
            ObjectAnimator.ofFloat(view1, "translationX", 0f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view1, "translationY", -1500f, 0f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view6, "translationY", 1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view4, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view3, "translationX", 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view3, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view5, "translationX", 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view5, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view2, "translationY", -1800f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view6, "translationY", -1800f, 0f).apply {
                duration = 2000
                start()
            }
        }
        Reset.setOnClickListener{
            ObjectAnimator.ofFloat(view7, "translationX", 0f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view7, "translationY", -1500f, 0f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view12, "translationY", 1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view10, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view9, "translationX", 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view9, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view11, "translationX", 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view11, "translationY", -1500f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view8, "translationY", -1800f, 0f).apply {
                duration = 2000
                start()
            }
            ObjectAnimator.ofFloat(view12, "translationY", -1800f, 0f).apply {
                duration = 2000
                start()
            }

        }
    }
}