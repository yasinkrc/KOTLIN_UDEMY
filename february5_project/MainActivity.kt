package com.example.february5_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.february5_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding  :ActivityMainBinding
    private lateinit var adapter: FilmAdapter
    private lateinit var filmlerArrayList:ArrayList<Filmler>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root  )

        binding.rv.setHasFixedSize(true) //tasarimi ekranda güzel bir şekilde göstermek amacıyla kullanılıır
        binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val f1 =Filmler(1,"Amour","amour",12.99)
        val f2 =Filmler(2,"Aqua","aqua",62.99)
        val f3 =Filmler(3,"Deniz","deniz",52.99)
        val f4 =Filmler(4,"Geçmiş Olsun","gecmisolsun",82.99)
        val f5 =Filmler(5,"Hayvan","hayvan",15.99)
        val f6 =Filmler(6,"İyi Bir Aile","iyibiraile",32.99)
        val f7 =Filmler(7,"Kapı","kapi",2.99)
        val f8 =Filmler(8,"Kuantum","kuantum",22.99)
        val f9 =Filmler(9,"Orduya Bedel","orduyabedel",42.99)
        val f10 =Filmler(10,"Venum","venum",11.99)
        val f11 =Filmler(11,"Dilek","dilek",10.99)


        filmlerArrayList=ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)
        filmlerArrayList.add(f7)
        filmlerArrayList.add(f8)
        filmlerArrayList.add(f9)
        filmlerArrayList.add(f10)
        filmlerArrayList.add(f11)

        adapter=FilmAdapter(this,filmlerArrayList)
        binding.rv.adapter=adapter


    }
}