package net.ivanvega.actividadesenandorid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent =  getIntent();

        String user = intent.getStringExtra("user");

        Toast.makeText(this, "Bienvenido " + user ,
                Toast.LENGTH_LONG).show();


    }



}