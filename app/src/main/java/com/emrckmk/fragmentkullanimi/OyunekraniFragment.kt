package com.emrckmk.fragmentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_oyunekrani.view.*


class OyunekraniFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tasarim =inflater.inflate(R.layout.fragment_oyunekrani, container, false)

        val bundle : OyunekraniFragmentArgs by navArgs()
        val ad = bundle.ad
        val yas = bundle.yas
        val bekar = bundle.bekarMi
        val kisiler = bundle.kisiler


        println("Ad :"+ad+","+"Yas :"+yas.toString()+","+"Bekar Mı :"+bekar.toString()+","+"Kişi Nesnesinden :"+kisiler.isim+","+kisiler.puan.toString())


        tasarim.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraniGecis)

        }
        return tasarim
    }


}