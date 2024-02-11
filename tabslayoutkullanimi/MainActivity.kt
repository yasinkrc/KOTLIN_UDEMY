package com.example.tabslayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabslayoutkullanimi.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentListesi =ArrayList<Fragment>()
    private val fragmentBaslikListesi =ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        fragmentListesi.add(FragmentBirinci())
        fragmentListesi.add(FragmentIkinci())
        fragmentListesi.add(FragmentUcuncu())

        val adapter=MyViewPagerAdapter(this)
        binding.viewPager2.adapter=adapter
        fragmentBaslikListesi.add("BİR")
        fragmentBaslikListesi.add("İKİ")
        fragmentBaslikListesi.add("ÜÇ")
        TabLayoutMediator(binding.tablayout,binding.viewPager2){tab,position->
            tab.setText(fragmentBaslikListesi[position])

        }.attach()

        binding.tablayout.getTabAt(0)!!.setIcon(R.drawable.resim)
        setContentView(binding.root)
    }

    inner class MyViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {

            return fragmentListesi.size
        }

        override fun createFragment(position: Int): Fragment {


            return fragmentListesi[position]
        }




    }
}