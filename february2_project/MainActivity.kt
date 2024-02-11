package com.example.february2_project

import android.content.DialogInterface
import android.graphics.Color
import android.location.GnssNavigationMessage
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.PopupMenu
import com.example.february2_project.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Normal.setOnClickListener { x->

            val sb=Snackbar.make(x,"İnternet Bağlantısı Yok !",Snackbar.LENGTH_LONG)

            sb.setAction("Tekrar deneyin !"){


            }

         sb.setActionTextColor(Color.RED)
         sb.setTextColor(Color.BLUE)
         sb.setBackgroundTint(Color.WHITE)

         sb.show()
        }

       /* binding.Normal.setOnClickListener {

        val ad =AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam"){ DialogInterface ,i->

                Toast.makeText(applicationContext,"Tamam Tıklanıldı",Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("İptal"){ DialogInterface ,i->

                Toast.makeText(applicationContext,"İptal Tıklanıldı",Toast.LENGTH_SHORT).show()
            }
           ad.create().show()
        }


        */
        binding.Ozel.setOnClickListener {

            val tasarim =layoutInflater.inflate(R.layout.alert_tasarim,null)
            val editTextAlert=tasarim.findViewById(R.id.editTextTextName) as EditText

            val ad =AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setView(tasarim)
            ad.setPositiveButton("Kaydet"){ DialogInterface ,i->

                val alinanVeri=editTextAlert.text.toString()

                Toast.makeText(applicationContext,"Alınan veri : $alinanVeri",Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("İptal"){ DialogInterface ,i->

                Toast.makeText(applicationContext,"İptal Tıklanıldı",Toast.LENGTH_SHORT).show()
            }
            ad.create().show()
        }

        /*binding.buttonMenuAc.setOnClickListener {


            val popup=PopupMenu(this@MainActivity,binding.buttonMenuAc)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener { item->

                when(item.itemId){

                    R.id.action_sil->{
                        Toast.makeText(applicationContext,"Sil Seçildi",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_düzenle->{
                        Toast.makeText(applicationContext,"Düzenle Seçildi",Toast.LENGTH_SHORT).show()
                        true

                    }
                    else ->{
                        false

                    }
                }
            }


        }

         */
    }
}