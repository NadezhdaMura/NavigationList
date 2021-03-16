package com.example.navigationlist

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
var click = requireActivity().findViewById<RelativeLayout>(R.id.click)
        var listOfColors = listOf("#FF0000","#FFA500","#A52A2A","#25383C","#DFFF00","#FFBF00",
        "#FF7F50","#9FE2BF","#CCCCFF","#DE3163","#9FE2BF","#6495ED","#CD5C5C","#E53009","#DC143C",
        "#FF6347","#9400D3","#6A5ACD","#BC8F8F","#D2691E","#00FF00","#00FF00","#778899")
        var number = 0
        click.setOnClickListener{
            click.setBackgroundColor(Color.parseColor(listOfColors.random()))
            number++
            text.text = number.toString()
        }
    }
}