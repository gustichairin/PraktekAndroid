package com.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hitung.*

class HitungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        buttonHitung.setOnClickListener{
            var isEmptyField = false

            val stringPanjang = editPanjang.text.toString().trim().toFloat()
            val stringLebar = editLebar.text.toString().trim().toFloat()
            val stringTinggi = editTinggi.text.toString().trim().toFloat()

            if(stringPanjang.equals("")){
                isEmptyField = true
                editPanjang.error = "Data Kosong"
            }

            if(stringLebar.equals("")){
                isEmptyField = true
                editLebar.error = "Data Kosong"
            }

            
            if(stringTinggi.== ""){
                isEmptyField = true
                editTinggi.error = "Data Kosong"
            }

            if(!isEmptyField) {

                val panjang = stringPanjang.toFloat()
                val lebar = stringLebar.toFloat()
                val tinggi = stringTinggi.toFloat()

                textHasil.text = (panjang * lebar * tinggi).toString()
            }
        }
    }
}
