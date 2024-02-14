package com.example.login_ekran_yapimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login_ekran_yapimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp =getSharedPreferences("GirisBilgi",Context.MODE_PRIVATE)
        val ogka=sp.getString("kullaniciAdi","Kullanıcı adı yok ")
        val ogs=sp.getString("sifre","Şifre Yok")

        if (ogka=="admin"&&ogs=="123"){
            startActivity(Intent(this@MainActivity,AnaEkranActivity::class.java))
            finish()
        }



        binding.buttonGiris.setOnClickListener {

            val ka=binding.editTextKullaniciAdi.text.toString()
            val s=binding.editTextSifre.text.toString()
            if (ka=="admin" && s=="123"){

                val editor =sp.edit()
                editor.putString("kullaniciAdi",ka)
                editor.putString("sifre",s)
                editor.commit()
                Toast.makeText(applicationContext,"Tebrikler Giriş Yapılıyor  ",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@MainActivity,AnaEkranActivity::class.java))
                finish()
            }else{
                if(ka!="admin"&&s!="123"){
                    Toast.makeText(applicationContext,"Kullanıcı adı ve Şifre Hatalı ",Toast.LENGTH_SHORT).show()
                }else if (ka=="admin" && s!="123"){
                    Toast.makeText(applicationContext,"Şifre  Hatalı ",Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext,"Kullanıcı   Hatalı ",Toast.LENGTH_SHORT).show()
                }
            }


        }

    }

}