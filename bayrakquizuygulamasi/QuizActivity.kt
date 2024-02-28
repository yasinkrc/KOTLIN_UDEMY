package com.example.bayrakquizuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bayrakquizuygulamasi.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var  binding :ActivityQuizBinding
    private lateinit var sorular :ArrayList<Bayraklar>
    private lateinit var yanlisSecenekler :ArrayList<Bayraklar>
    private lateinit var dogruSoru :Bayraklar
    private lateinit var tumSecenekler :HashSet<Bayraklar>
    private lateinit var vt :VeriTabaniYardimcisi


    private var soruSayac=0
    private var dogruSayac =0
    private var yanlisSayac=0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vt=VeriTabaniYardimcisi(this)


        sorular=BayraklarDao().rasgele5BayrakGetir(vt)
        soruYukle()


        binding.buttonA.setOnClickListener {

            dogruKontrolButton(binding.buttonA)
            soruSayacKontrol()

        }
        binding.buttonB.setOnClickListener {

            dogruKontrolButton(binding.buttonB)
            soruSayacKontrol()

        }
        binding.buttonC.setOnClickListener {

            dogruKontrolButton(binding.buttonC)
            soruSayacKontrol()

        }
        binding.buttonD.setOnClickListener {

            dogruKontrolButton(binding.buttonD)
            soruSayacKontrol()

        }
    }

    fun soruYukle(){

        binding.textViewSoruSayisi.text="${soruSayac+1}. Soru"

        dogruSoru=sorular.get(soruSayac)

        binding.imageViewBayrak.setImageResource(resources.getIdentifier(dogruSoru.bayrak_resim,"drawable",packageName))

        yanlisSecenekler=BayraklarDao().rasgele3yanlisSecenekGetir(vt,dogruSoru.bayrak_id)
        tumSecenekler= HashSet()
        tumSecenekler.add(dogruSoru)
        tumSecenekler.add(yanlisSecenekler.get(0))
        tumSecenekler.add(yanlisSecenekler.get(1))
        tumSecenekler.add(yanlisSecenekler.get(2))

        binding.buttonA.text=tumSecenekler.elementAt(0).bayrak_ad
        binding.buttonB.text=tumSecenekler.elementAt(1).bayrak_ad
        binding.buttonC.text=tumSecenekler.elementAt(2).bayrak_ad
        binding.buttonD.text=tumSecenekler.elementAt(3).bayrak_ad
    }

    fun soruSayacKontrol(){

        soruSayac++
        if(soruSayac!=5)
        {
            soruYukle()
        }else{
            val intent=Intent(this@QuizActivity,ResultActivity::class.java)
            intent.putExtra("dogruSayac",dogruSayac)
            intent.putExtra("yanlisSayac",yanlisSayac)
            startActivity(intent)
            finish()
        }
    }

    fun  dogruKontrolButton(button: Button){
        val buttonYazi=button.text.toString()
        val dogruCevap=dogruSoru.bayrak_ad

        if (buttonYazi==dogruCevap){
            dogruSayac++
        }else{
            yanlisSayac++
        }

        binding.textViewDogru.text="Doğru : $dogruSayac "
        binding.textViewYanlis.text="Yanlış : $yanlisSayac "
    }
}