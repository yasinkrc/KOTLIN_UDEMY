package com.example.february5_project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val mContext: Context, private val filmlerListesi :List<Filmler>)
    :RecyclerView.Adapter<FilmAdapter.CardTasarimNesneleriniTutucu>() {




    inner class CardTasarimNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageViewFilmResim:ImageView
        var textViewFilmBaslik :TextView
        var textViewFilmFiyat:TextView
        var buttonSepeteEkle :Button

        init {
            imageViewFilmResim=view.findViewById(R.id.imageViewFilm)
            textViewFilmBaslik=view.findViewById(R.id.textfilmBaslik)
            textViewFilmFiyat=view.findViewById(R.id.textViewFilmFiyat)
            buttonSepeteEkle=view.findViewById(R.id.buttonSepeteEkle)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardTasarimNesneleriniTutucu {

     val tasarim =LayoutInflater.from(mContext).inflate(R.layout.card_filim_tasarim,parent,false)

         return CardTasarimNesneleriniTutucu(tasarim)

    }

    override fun getItemCount(): Int {

        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {

       val film=filmlerListesi[position]

        holder.textViewFilmBaslik.text=film.film_ad
        holder.textViewFilmFiyat.text="${film.film_fiyat} TL"

        holder.imageViewFilmResim.setImageResource(mContext.resources.getIdentifier(film.film_resim_ad,"drawable",mContext.packageName))

        holder.buttonSepeteEkle.setOnClickListener {


            Toast.makeText(mContext,"${film.film_ad} sepete eklendi",Toast.LENGTH_SHORT).show()

        }

    }
}