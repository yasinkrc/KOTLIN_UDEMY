package com.example.preferencedatastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first

class AppPref(var context: Context) {

    val Context.ds :DataStore<Preferences> by preferencesDataStore("bilgiler")

    companion object {
        val AD_KEY = stringPreferencesKey("AD")
        val YAS_KEY= intPreferencesKey("YAS")
        val BOY_KEY= doublePreferencesKey("BOY")
        val BEKAR_KEY= booleanPreferencesKey("BEKAR")
        val ARKADAS_LISTE_KEY= stringSetPreferencesKey("ARKADAS_LISTE")
        val SAYAC_KEY= intPreferencesKey("SAYAC")

    }

    suspend fun kayitAd(ad :String){
        context.ds.edit {

            it[AD_KEY]=ad


        }
    }

    suspend fun okuAd() :String{
        val p = context.ds.data.first()
        return p[AD_KEY]?:"isim yok"
    }

    suspend fun silAd(){
          context.ds.edit {

              it.remove(AD_KEY)
          }
    }

    suspend fun kayitYas(yas:Int){

        context.ds.edit {
            it[YAS_KEY]=yas
        }
    }

    suspend fun okuYas(): Int {

        val p =context.ds.data.first()
        return p[YAS_KEY] ?:0
    }

    suspend fun kayitBoy(boy:Double){

        context.ds.edit {
            it[BOY_KEY]=boy
        }
    }

    suspend fun okuBoy(): Double {

        val p =context.ds.data.first()
        return p[BOY_KEY] ?:0.0
    }
    suspend fun kayitBekar(bekar:Boolean){

        context.ds.edit {
            it[BEKAR_KEY]=bekar
        }
    }

    suspend fun okuBekar(): Boolean {

        val p =context.ds.data.first()
        return p[BEKAR_KEY] ?:false
    }

    suspend fun kayitArkadasListe(liste:Set<String>){

        context.ds.edit {
            it[ARKADAS_LISTE_KEY]=liste
        }
    }

    suspend fun okuArkadasListe(): Set<String>{

        val p =context.ds.data.first()
        return p[ARKADAS_LISTE_KEY]!!
    }

    suspend fun kayitSayac(sayac :Int){

        context.ds.edit {
            it[SAYAC_KEY]=sayac
        }
    }

    suspend fun okuSayac() :Int {
        val p =context.ds.data.first()
        return p [SAYAC_KEY] ?:0
    }
}