package com.zeyneparslan.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ilkSayi : Double? = null
    var ikinciSayi : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla(view: View){
        ilkSayi = txtIlkSayi.text.toString().toDouble()
        ikinciSayi = txtIkinciSayi.text.toString().toDoubleOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            txtSonuc.text="Sayı girmeyi unutmuşsunuz."
        }
        else{
            sonuc = ilkSayi!! + ikinciSayi!!
            txtSonuc.text = "Sonuç: ${sonuc}"
        }
    }
    fun cikar(view: View){
        ilkSayi = txtIlkSayi.text.toString().toDoubleOrNull()
        ikinciSayi = txtIkinciSayi.text.toString().toDoubleOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            txtSonuc.text="Sayı girmeyi unutmuşsunuz."
        }
        else{
            sonuc = ilkSayi!! - ikinciSayi!!
            txtSonuc.text = "Sonuç: ${sonuc}"
        }
    }
    fun carp(view: View){
        ilkSayi = txtIlkSayi.text.toString().toDoubleOrNull()
        ikinciSayi = txtIkinciSayi.text.toString().toDoubleOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            txtSonuc.text="Sayı girmeyi unutmuşsunuz."
        }
        else{
            sonuc = ilkSayi!! * ikinciSayi!!
            txtSonuc.text = "Sonuç: ${sonuc}"
        }
    }
    fun bol(view: View){
        ilkSayi = txtIlkSayi.text.toString().toDoubleOrNull()
        ikinciSayi = txtIkinciSayi.text.toString().toDoubleOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            txtSonuc.text="Sayı girmeyi unutmuşsunuz."
        }
        else{
            sonuc = ilkSayi!! / ikinciSayi!!
            txtSonuc.text = "Sonuç: ${sonuc}"
        }
    }
}