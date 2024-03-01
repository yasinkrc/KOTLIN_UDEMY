package com.example.filmleruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.filmleruygulamasi.databinding.ActivityFilmlerBinding
import com.example.filmleruygulamasi.databinding.ActivityMainBinding

class FilmlerActivity : AppCompatActivity() {
    private lateinit var binding :ActivityFilmlerBinding
    private lateinit var filmiListe:ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter
    private lateinit var vt :VeritabaniYardimcisi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFilmlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kategori=intent.getSerializableExtra("kategoriNesne") as Kategoriler

        binding.toolbarfilmler.title="Filmler :${kategori.kategori_ad}"
        setSupportActionBar(binding.toolbarfilmler)


        binding.rvFilmler.setHasFixedSize(true)
        binding.rvFilmler.layoutManager= StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        vt =VeritabaniYardimcisi(this)
       filmiListe=FilmlerDao().tumFilmlerKategoriById(vt,kategori.kategori_id)
        adapter=FilmlerAdapter(this,filmiListe)
        binding.rvFilmler.adapter=adapter



        /*
                filmiListe=ArrayList()

                val k =Kategoriler(1,"Dram")
                val y =Yonetmenler(1,"Quentin Tarantino")

                val f1=Filmler(1,"Django",2008,"django",k,y)
                val f2=Filmler(2,"Inception",2009,"inception",k,y)
                val f3=Filmler(3,"The Pianist",2010,"thepianist",k,y)

                filmiListe.add(f1)
                filmiListe.add(f2)
                filmiListe.add(f3)

         */



    }


}