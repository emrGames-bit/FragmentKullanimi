package com.emrckmk.fragmentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*


class AnasayfaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tasarim =inflater.inflate(R.layout.fragment_anasayfa, container, false)


        tasarim.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.oyunEkraniGecis)

        }

        return tasarim
    }


}