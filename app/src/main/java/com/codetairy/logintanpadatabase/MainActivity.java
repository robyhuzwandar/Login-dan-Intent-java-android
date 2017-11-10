package com.codetairy.logintanpadatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    String txt_email, txt_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view){
        editText1 = (EditText)findViewById(R.id.txt_email);
        editText2 = (EditText)findViewById(R.id.txt_pass);

        txt_email = editText1.getText().toString();
        txt_pass = editText2.getText().toString();

        if(txt_email.equalsIgnoreCase("") && txt_pass.equals("")){
            Toast.makeText(MainActivity.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }else if (!txt_email.equalsIgnoreCase("roby@gmail.com") && !txt_pass.equals("123")){
            Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
        }else if(txt_pass.equals("")){
            Toast.makeText(MainActivity.this, "Password Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else if(txt_email.equals("")) {
            Toast.makeText(MainActivity.this, "Email Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else if(!txt_email.equalsIgnoreCase("roby@gmail.com")) {
            Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();
        }else if(!txt_pass.equals("123")){
            Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Halaman2Activity.class);
            MainActivity.this.startActivity(intent);
            MainActivity.this.finish();
        }

    }

    public void toDaftar(View v){
        Intent intentDaftar = new Intent(MainActivity.this, HalamanDaftar.class);
        MainActivity.this.startActivity(intentDaftar);
        MainActivity.this.finish();
    }

}
