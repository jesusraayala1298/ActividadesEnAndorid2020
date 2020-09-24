package net.ivanvega.actividadesenandorid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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
        //Bryan OSwaldo Jiménez Guzmán

    }


    public void btnIntentTel_click(View v){
    /*
        Uri number = Uri.parse("tel:5551234");
        Intent intent = new Intent(Intent.ACTION_DIAL);
        //Intent intent = new Intent(Intent.ACTION_DIAL, number);
        intent.setData(number);

        startActivity(intent);
        */
        Uri webpage = Uri.parse("https://www.android.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                // Always use string resources for UI text.
        // This says something like "Share this photo with"
                //String title = getResources().getString(R.string.chooser_title);
        String title = "Mi titutlo";
        // Create intent to show chooser
                Intent chooser = Intent.createChooser(intent, title);


                // Verify the intent will resolve to at least one activity
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
        }


    }

}