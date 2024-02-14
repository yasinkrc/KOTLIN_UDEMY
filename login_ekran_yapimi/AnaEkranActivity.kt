package com.example.login_ekran_yapimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_ekran_yapimi.databinding.ActivityAnaEkranBinding

class AnaEkranActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnaEkranBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAnaEkranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp =getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE)
        val ka=sp.getString("kullaniciAdi","Kullanıcı adı yok ")
        val s=sp.getString("sifre","Şifre Yok")

        binding.textViewCikti.text="Kullanıcı Adı :$ka Şifre :$s"
        binding.buttonCikisYap.setOnClickListener {

            val editor =sp.edit()
            editor.remove("kullanciAdi")
            editor.remove("sifre")
            editor.commit()
            startActivity(Intent(this@AnaEkranActivity,MainActivity::class.java))
            finish()

        }

    }
}