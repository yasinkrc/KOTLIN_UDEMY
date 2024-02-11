package com.example.february3_project

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.february3_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,SearchView.OnQueryTextListener{

    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbar.title="Arama"

        setSupportActionBar(binding.toolbar)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu,menu) // bağlanma oldu

        val item = menu!!.findItem(R.id.action_ara)
        val searchView=item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String?): Boolean { // adım adım arama yapar
        Log.e("onQueryTextSubmit",query.toString())
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean { //direk sonda tuşa basınac araa yapan bir func
        Log.e("onQueryTextChange",newText.toString())

        return true
    }
    /*
            binding.toolbar.title="Toolbar Menü "
            setSupportActionBar(binding.toolbar)
        }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {

            menuInflater.inflate(R.menu.toolbar_menu,menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {

            when(item.itemId){
                R.id.action_bilgi->{

                    Toast.makeText(applicationContext,"Bilgi Tıklandı",Toast.LENGTH_SHORT).show()
                    return true
                }
                R.id.action_ayarlar->{

                    Toast.makeText(applicationContext,"Ayarlar  Tıklandı",Toast.LENGTH_SHORT).show()
                    return true
                }
                R.id.action_ekle->{

                    Toast.makeText(applicationContext,"Ekle Tıklandı",Toast.LENGTH_SHORT).show()
                    return true
                }
                R.id.action_cikis->{

                    Toast.makeText(applicationContext,"Çıkış Tıklandı",Toast.LENGTH_SHORT).show()
                    return true
                }
                else -> return super.onOptionsItemSelected(item)

            }

        }

     */

/*
        binding.buttonYap.setOnClickListener {

            val ad =binding.edittextAd.text.toString().trim()
            val tel=binding.editextTel.text.toString().trim()

            Toast.makeText(applicationContext,"$ad - $tel",Toast.LENGTH_SHORT).show()


        }

 */

      /*  binding.fab.setOnClickListener {


           // Toast.makeText(x,"Merhaba",Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_SHORT).show()
        }

       */

}