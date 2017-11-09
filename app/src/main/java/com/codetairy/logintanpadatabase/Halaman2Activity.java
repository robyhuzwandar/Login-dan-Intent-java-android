package com.codetairy.logintanpadatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Halaman2Activity extends AppCompatActivity {

    Button BtnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        BtnKembali = (Button)findViewById(R.id.btnKembali);
        BtnKembali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Halaman2Activity.this, MainActivity.class);
                    Halaman2Activity.this.startActivity(intent);
                    Halaman2Activity.this.finish();
                }
            });
        }
    }
