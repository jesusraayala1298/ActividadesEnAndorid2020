package net.ivanvega.actividadesenandorid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActividadDOs extends AppCompatActivity {
    private static final int ACTIVITY_REGISTRO = 1000 ;
    Button btnOk, btnCancel;
    EditText txtUsuario, txtContraseña;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second_activity);
        txtUsuario =     (EditText) findViewById(R.id.txtUser);
        txtContraseña =    findViewById(R.id.txtPass);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        btnOk .setOnClickListener( v -> {
            Toast.makeText(getBaseContext(), txtUsuario.getText().toString(),
                    Toast.LENGTH_LONG).show();



            Intent intent = new Intent(ActividadDOs.this,
                    MainActivity.class );

            intent.putExtra("user",
                    txtUsuario.getText().toString());
            intent.putExtra("id", 789);

            startActivity(intent);


        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Hola a todos :D
                finish();
            }


        });

        Log.d("ciclovida", "paso por oncreate");
    }

    public void btnRegistrar_click(View v){
        Intent intent =
                new Intent(getBaseContext(), ActivityRegitro.class  );

        startActivityForResult(intent, ACTIVITY_REGISTRO );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch ( requestCode ){
            case ACTIVITY_REGISTRO:
                if (resultCode==RESULT_OK){
                    Toast.makeText(this, "Usuario Registrado",
                            Toast.LENGTH_SHORT).show();
                    Usuario usnu =
                            (Usuario) data.getSerializableExtra("nuevoCliente");
                    txtUsuario.setText(usnu.getEmail());

                }else{
                    Toast.makeText(this, "Usuario NO Registrado",
                            Toast.LENGTH_SHORT).show();
                }
                break;

            case 2000:
                break;
        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclovida", "paso por onpause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclovida", "paso por onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclovida", "paso por onresume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclovida", "paso por onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclovida", "paso por restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclovida", "paso por ondestroy");
    }
}
