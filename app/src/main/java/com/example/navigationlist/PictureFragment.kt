package com.example.navigationlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_picture.*


class PictureFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_picture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var listOfPhotos = listOf(
            resources.getDrawable(R.drawable.ph), resources.getDrawable(R.drawable.photo1)
            , resources.getDrawable(R.drawable.photo2), resources.getDrawable(R.drawable.photo3)
            , resources.getDrawable(R.drawable.photo4), resources.getDrawable(R.drawable.photo5)
            , resources.getDrawable(R.drawable.photo6), resources.getDrawable(R.drawable.photo7)
            , resources.getDrawable(R.drawable.photo8), resources.getDrawable(R.drawable.photo9)
            ,resources.getDrawable(R.drawable.photo10), resources.getDrawable(R.drawable.tulips)
            , resources.getDrawable(R.drawable.eiffeltower), resources.getDrawable(R.drawable.waterfall)
            , resources.getDrawable(R.drawable.bridge), resources.getDrawable(R.drawable.cherry)
            , resources.getDrawable(R.drawable.sunset), resources.getDrawable(R.drawable.roseforest)
            , resources.getDrawable(R.drawable.sea), resources.getDrawable(R.drawable.venice)
            , resources.getDrawable(R.drawable.forest), resources.getDrawable(R.drawable.london)
            , resources.getDrawable(R.drawable.bamboo), resources.getDrawable(R.drawable.ship)
            , resources.getDrawable(R.drawable.earth), resources.getDrawable(R.drawable.tunnlezd),
            resources.getDrawable(R.drawable.berries),resources.getDrawable(R.drawable.panda),
            resources.getDrawable(R.drawable.fox), resources.getDrawable(R.drawable.rabbit)
        )
        text.setOnClickListener{
            text.visibility = View.VISIBLE
            text.visibility = View.GONE
        photoContainer.setOnClickListener {
            photoContainer.setBackground(listOfPhotos.random())

        }

        }


    }
}



