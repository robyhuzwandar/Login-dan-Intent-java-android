package com.codetairy.logintanpadatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HalamanDaftar extends AppCompatActivity {
    String nama, nim, alamat;
    EditText txt_nama, txt_nim, txt_alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_daftar);
    }

    public void Daftar(View view){
        txt_nama = (EditText)findViewById(R.id.txt_nama);
        txt_nim = (EditText)findViewById(R.id.txt_nim);
        txt_alamat = (EditText)findViewById(R.id.txt_alamat);

        nama = txt_nama.getText().toString();
        nim = txt_nim.getText().toString();
        alamat = txt_alamat.getText().toString();

        Intent i = new Intent(HalamanDaftar.this, HalamanTampil.class);
        i.putExtra("parse_nama", nama );
        i.putExtra("parse_nim", nim );
        i.putExtra("parse_alamat", alamat );
//        Bundle b = new Bundle();
//        b.putString("Parse_nama", nama);
//        b.putString("Parse_nim", nim);
//        b.putString("Parse_alamat", alamat);
//        i.putExtras(b);
        startActivity(i);
    }
}
