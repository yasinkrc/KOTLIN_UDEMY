package com.example.sozcukuygulamasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class KelimelerAdapter(private val mcontext:Context,private val kelimelerListe:List<Kelimeler>):
RecyclerView.Adapter<KelimelerAdapter.CardTasarimTutucu>(){


    inner class CardTasarimTutucu(tasarim:View) : RecyclerView.ViewHolder(tasarim){

        var kelime_card:CardView
        var textViewIngilizce:TextView
        var textViewTurkce:TextView

        init {
            kelime_card=tasarim.findViewById(R.id.kelime_card)
            textViewIngilizce=tasarim.findViewById(R.id.textViewIngilizce)
            textViewTurkce=tasarim.findViewById(R.id.textViewTurkce)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val tasarim =LayoutInflater.from(mcontext).inflate(R.layout.card_tasarim,parent,false)
        return  CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {

        return kelimelerListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

     var kelime =kelimelerListe.get(position)

        holder.textViewIngilizce.text=kelime.ingilizce
        holder.textViewTurkce.text=kelime.turkce

            holder.kelime_card.setOnClickListener {

             val intent =Intent(mcontext,DetayActivity::class.java)
                intent.putExtra("nesne",kelime)

                mcontext.startActivity(intent)

            }

    }
}