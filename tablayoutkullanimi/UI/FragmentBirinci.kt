package com.example.tablayoutkullanimi.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayoutkullanimi.databinding.FragmentBirinciLayoutBinding

class FragmentBirinci : Fragment() {

    private var _binding :FragmentBirinciLayoutBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Doğru layout dosyasını kullanın
        _binding = FragmentBirinciLayoutBinding.inflate(inflater, container, false)


        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}