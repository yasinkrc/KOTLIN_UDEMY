package com.example.preferencedatastorefarklikullanimlari

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.preferencedatastorefarklikullanimlari.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYaz.setOnClickListener {
            //hariciYaz()
            dahiliYaz()

        }
        binding.buttonoku.setOnClickListener {
            //hariciOku()
            dahiliOku()
        }
        binding.buttonSil.setOnClickListener {
            //hariciSil()
            dahiliSil()
        }

    }


    fun hariciOku(){
        try {
            val yol=applicationContext.getExternalFilesDir(null)!!.absolutePath
            val dosya= File(yol,"dosyam.txt")

            val fr=FileReader(dosya)
            val okuyucu =BufferedReader(fr)
            val sb=StringBuilder()

            var satir :String?=null

            while ({satir=okuyucu.readLine();satir}()!=null){
                sb.append(satir+"\n")
            }
            okuyucu.close()
            binding.editTextGirdi.setText(sb.toString())
        } catch (e:Exception){
            e.printStackTrace()
        }
    }
    fun hariciSil(){
        val yol=applicationContext.getExternalFilesDir(null)!!.absolutePath
        val dosya= File(yol,"dosyam.txt")
        dosya.delete()
    }

    fun dahiliYaz(){
        try {

            val  fo =openFileOutput("dosyam.txt", Context.MODE_PRIVATE)
            val yazici =OutputStreamWriter(fo)
            yazici.write((binding.editTextGirdi.text.toString()))
            yazici.close()
            binding.editTextGirdi.setText("")

        }catch (e :Exception){
            e.printStackTrace()

        }
    }

    fun dahiliOku(){
        try {

            val fi =openFileInput("dosyam.txt")
            val isr=InputStreamReader(fi)
            val okuyucu =BufferedReader(isr)
            val sb=StringBuilder()

            var satir :String?=null

            while ({satir=okuyucu.readLine();satir}()!=null){
                sb.append(satir+"\n")
            }
            okuyucu.close()
            binding.editTextGirdi.setText(sb.toString())

        }catch (e :Exception){
            e.printStackTrace()

        }
    }

    fun dahiliSil(){

        val yol =filesDir
        val dosya=File(yol,"dosyam.txt")


        dosya.delete()
    }

}