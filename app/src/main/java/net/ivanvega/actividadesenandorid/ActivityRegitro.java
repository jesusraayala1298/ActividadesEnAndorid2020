package net.ivanvega.actividadesenandorid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityRegitro extends AppCompatActivity {

    TextView txtNombre, txtPass, txtEmail, txtTel;
    Button btnAgregar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regitro);

        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtPass = (TextView) findViewById(R.id.txtPassword);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtTel = (TextView) findViewById(R.id.txtTel);

        btnAgregar = (Button) findViewById(R.id.btnGuardar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String pass = txtPass.getText().toString();
                String email = txtEmail.getText().toString();
                String tel = txtTel.getText().toString();
                Usuario nuevo =
                        new Usuario(nombre,tel,email,pass);

                Intent intent = new Intent();
                intent.putExtra("nuevoCliente", nuevo);
                Toast.makeText(getApplicationContext(), "Objecto guardado dentro de Intent!", Toast.LENGTH_LONG).show();

                setResult(Activity.RESULT_OK,  intent  );
                finish();
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
