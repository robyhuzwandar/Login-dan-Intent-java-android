package com.codetairy.logintanpadatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HalamanTampil extends AppCompatActivity {
    String nama, nim, alamat, jurusan;
    TextView txt_nama, txt_nim, txt_alamat, txt_jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_tampil);

        txt_nama = (TextView)findViewById(R.id.txt_namaT);
        txt_nim = (TextView)findViewById(R.id.txt_nimT);
        txt_alamat = (TextView)findViewById(R.id.txt_alamatT);
        txt_jurusan = (TextView)findViewById(R.id.txt_jurusanT);

        nama = getIntent().getStringExtra("parse_nama");
        nim = getIntent().getStringExtra("parse_nim");
        alamat = getIntent().getStringExtra("parse_alamat");
        jurusan = getIntent().getStringExtra("parse_jurusan");

        txt_nama.setText("Nama : " +nama);
        txt_nim.setText("Nim : " +nim);
        txt_alamat.setText("Alamat : " + alamat);
        txt_jurusan.setText("Jurusan : " + jurusan);
    }
}
