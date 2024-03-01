package com.example.filmleruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmleruygulamasi.databinding.ActivityDetayBinding
import com.example.filmleruygulamasi.databinding.ActivityFilmlerBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val film =intent.getSerializableExtra("filmNesne") as Filmler

        binding.textViewFilmad.text=film.film_ad
        binding.textViewFilmad.text=film.film_yil.toString()
        binding.textViewyonetmen.text=film.yonetmen.yonetmen_ad

        binding.imageView.setImageResource(this.resources.getIdentifier(film.film_resim,"drawable",this.packageName))


    }
}