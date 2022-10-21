package com.berliana.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlamat, btnTelepon, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlamat = findViewById(R.id.btnAlamat);
        btnTelepon = findViewById(R.id.btnTelepon);
        btnEmail = findViewById(R.id.btnEmail);

        btnAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri Alamat = Uri.parse("https://goo.gl/maps/PY2qdykXZKJzijiQA");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Alamat);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="085712318229";
                Intent panggil = new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(panggil);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email=("diraarofat2002@gmail.com");
                Intent gmail = new Intent(Intent.ACTION_SEND);
                gmail.setType("message/rtc822");
                gmail.putExtra(Intent.EXTRA_EMAIL, Email);
                startActivity(gmail);
            }
        });

    }
}