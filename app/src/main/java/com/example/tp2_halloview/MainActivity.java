package com.example.tp2_halloview;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nom;
    private TextView txt_aff;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //

        txt_nom = findViewById(R.id.id_Enom);
        txt_aff = findViewById(R.id.id_aff);
      
    }


    public void onClick(View view) {

        if(txt_nom.getText().length() == 0){
            txt_aff.setText(R.string.msg_vide);
        }else {
            String nom = txt_nom.getText().toString();
            String ress = getString(R.string.re)+ " " + nom;
            txt_aff.setText(ress);

        }

    }
}