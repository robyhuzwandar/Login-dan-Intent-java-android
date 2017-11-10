package com.codetairy.logintanpadatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HalamanTampil extends AppCompatActivity {
    String nama, nim, alamat;
    TextView txt_nama, txt_nim, txt_alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_tampil);

        txt_nama = (TextView)findViewById(R.id.txt_namaT);
        txt_nim = (TextView)findViewById(R.id.txt_nimT);
        txt_alamat = (TextView)findViewById(R.id.txt_alamatT);

        Bundle b = getIntent().getExtras();
        nama = b.getString("parse_nama");
        nim = b.getString("parse_nim");
        alamat = b.getString("parse_alamat");

        txt_nama.setText("Nama : " +nama);
        txt_nim.setText("Nim : " +nim);
        txt_alamat.setText("Alamat : " +alamat);
    }
}
