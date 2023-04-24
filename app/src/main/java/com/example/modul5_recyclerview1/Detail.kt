package com.example.modul5_recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class Detail : AppCompatActivity() {
    // ini di set dlu ya, mirip punyaku ikutin aja
    // wait aku cek adapternya dl

//    intent.putExtra("nama_mhs", mhs.namamhs)
//    intent.putExtra("nim_mhs", mhs.Nimmhs)
//    intent.putExtra("telp_mhs", mhs.Telpmhs)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

    val nama = intent.getStringExtra("nama_mhs")
    val nim = intent.getStringExtra("nim_mhs")
    val telp = intent.getStringExtra("telp_mhs")

    val _nama = findViewById<TextView>(R.id.nama_mahasiswa)
    _nama.setText(nama)
    val _nim = findViewById<TextView>(R.id.nim_mahasiswa)
    _nim.setText(nim)
    val _telp = findViewById<TextView>(R.id.telp_mahasiswa)
    _telp.setText(telp)
    }
}