package com.example.kisileruygulamasiapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import java.math.MathContext

class KisilerAdapter(private  val mContext: Context , private  val kisilerListe : List<Kisiler>)
    :RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

   inner class  CardTasarimTutucu(tasarim :View) :RecyclerView.ViewHolder(tasarim){



       var imageViewNokta :ImageView
       var textViewKisiBilgi :TextView

       init {
           imageViewNokta=tasarim.findViewById(R.id.imageViewNokta)
           textViewKisiBilgi=tasarim.findViewById(R.id.textViewKisiBilgi)
       }


   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val tasarim =LayoutInflater.from(mContext).inflate(R.layout.kisi_card_tasarimi,parent,false)

        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {

        return  kisilerListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val kisi =kisilerListe.get(position)

        holder.textViewKisiBilgi.text="${kisi.kisi_ad} - ${kisi.kisi_tel}"

        holder.imageViewNokta.setOnClickListener {


            val popupMenu =PopupMenu(mContext,holder.imageViewNokta)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)

            popupMenu.setOnMenuItemClickListener { menuItem->

                when(menuItem.itemId){
                    R.id.action_sil->{
                        Snackbar.make(holder.imageViewNokta,"${kisi.kisi_ad} silinsin mi ?",Snackbar.LENGTH_SHORT)
                            .setAction("EVET"){

                            }.show()
                        true
                    }
                    R.id.action_guncele->{
                        alertGoster(kisi)
                        true
                    }

                    else ->false

                }
            }
            popupMenu.show()

        }


    }
    @SuppressLint("MissingInflatedId")
    fun alertGoster(kisi:Kisiler) {


        val tasarim =LayoutInflater.from(mContext).inflate(R.layout.alert_tasarim,null)
        val editTextAd=tasarim.findViewById(R.id.editTextAd) as EditText
        val editTextTel=tasarim.findViewById(R.id.editTextTel) as EditText

        editTextAd.setText(kisi.kisi_ad)
        editTextTel.setText(kisi.kisi_tel)

        val ad = AlertDialog.Builder(mContext)

        ad.setTitle("Kişi Güncelle")
        ad.setView(tasarim)
        ad.setPositiveButton("Güncelle"){dialogInterface,i->

            val kisi_ad=editTextAd.text.toString().trim()
            val kisi_Tel=editTextTel.text.toString().trim()

            Toast.makeText(mContext,"$kisi_ad - $kisi_Tel", Toast.LENGTH_SHORT).show()

        }
        ad.setNegativeButton("İptal"){dialogInterface,i->


        }
        ad.create().show()
    }
}
