package com.example.shared_preferancesp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shared_preferancesp.databinding.ActivityActivitybBinding

class Activityb : AppCompatActivity() {
    private lateinit var binding :ActivityActivitybBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityActivitybBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sp =getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
        val editor =sp.edit()

        editor.remove("ad")
        editor.commit()

        """ Önemli """

       /* val  ad =sp.getString("ad","isim yok")
        val yas =sp.getInt("yas",0)
        val boy =sp.getFloat("boy",0.0f)
        val bekarMi=sp.getBoolean("bekarMi",true)

        val liste =sp.getStringSet("arkadasListesi",null)

        Log.e("Ad",ad.toString())
        Log.e("Yas",yas.toString())
        Log.e("Boy",boy.toString())
        Log.e("Bekar Mı : ",bekarMi.toString())

        if(liste!=null){
            for (i  in liste){
                Log.e("Liste :",i)
            }

        }*/
    }


}