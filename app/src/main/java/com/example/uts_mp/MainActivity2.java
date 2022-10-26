package com.example.uts_mp;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public  class MainActivity2 extends AppCompatActivity {

    Context context;
    Toast toast;
    Button login;
    int duration;
    String myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (Button) findViewById(R.id.Login);
        context = getApplicationContext();
        myToast = "Login Berhasil";
        duration = Toast.LENGTH_LONG;
        toast = Toast.makeText(context, myToast, duration);
        toast.show();
        // arraylist untuk menampung data tempat wisata
        final ArrayList<TempatWisata> tempatWisataArrayList = new ArrayList<TempatWisata>();
        //menambahkan data tempatwisata ke tempatWisataArrayList
        tempatWisataArrayList.add(new TempatWisata(R.drawable.pasirputih, "Pasir Putih", "Jln. Raya Pasir Putih No.87, Selomukti, Mlandingan, Pandansari, Bungatan, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.pathek, "Pathek", "Jalan Pantai Pathek, Gelung Selatan, Gelung, Kecamatan Situbondo, Kabupaten Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.tampora, "Tampora", "Jalan Tampora, Besuki, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.balanan, "Balanan", "Desa Wonorejo, Kecamatan Banyu Putih, Kabupaten Situbondo, Jawa Timur"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.lempuyang, "Lempuyang", "Pintu masuk Karangtekok, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.tangsi, "Tangsi", "Desa Pecinan/Simiring, Mangaran, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.bama, "Bama", "Banyuputih, Kabupaten Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.jangkar, "Jangkar", "Desa Jangkar, Situbondo, Jawa Timur, Indonesia"));

        // Memasang TempatWisataAdapter
        TempatWisataAdapter tempatWisataAdapter = new TempatWisataAdapter(this, tempatWisataArrayList);

        // Menemukan ListView menggunakan id
        ListView listView = findViewById(R.id.listview);

        // pasang tempatWisataAdapter ke listview.
        listView.setAdapter(tempatWisataAdapter);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Apakah Kamu Sudah selesai Membaca?")
                .setPositiveButton("sudah", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        finish();
                    }
                })
                .setNegativeButton("BELUM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                     dialogInterface.cancel();
                    }
                })
                .show();


        }
    }



