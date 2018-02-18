package com.example.user.pradikaadhea_1202154132_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //Daftar Menu Makanan
    private String[] Judul = {"Nasi Goreng", "Sayur Asem","Ayam Goreng","Ayam Kecap","Soto Ayam",
            "Cah Kangkung","Ikan Goreng","Jengkol","Kwetiau","Sop"};
    //Daftar Harga
    private String[] test = {"Rp.15.000", "Rp. 5.000","Rp. 10.000","Rp. 10.000","Rp. 15.000","Rp. 8.000","Rp. 15.000","Rp. 8.000",
            "Rp. 12.000","Rp. 15.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.nasigoreng, R.drawable.asem,R.drawable.ayamgoreng,R.drawable.ayamkecap,R.drawable.soto,
            R.drawable.cahkangkung,R.drawable.ikangoreng,R.drawable.jengkol,R.drawable.kwetiau,R.drawable.sop};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //mensetting toolbar yang akan muncul di atas dengan nama List Makanan
        //Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        //setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

//        iniDataMenu();
//        iniDataHarga();
//        initgambar();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}