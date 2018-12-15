package com.ismailsozen.bedenkitleendeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HesaplaActivity extends AppCompatActivity {

    private EditText editTextKilo, editTextBoy;
    private Button buttonSonuc;
    private double kilo,boy,sonuc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapla);

        editTextKilo=findViewById(R.id.editTextKilo);
        editTextBoy=findViewById(R.id.editTextBoy);
        buttonSonuc=findViewById(R.id.buttonSonuc);




        buttonSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editTextKilo.getText().toString().isEmpty() || editTextBoy.getText().toString().isEmpty()) {

                }
                else {
                kilo=Double.parseDouble(editTextKilo.getText().toString());
                boy=Double.parseDouble(editTextBoy.getText().toString());
                sonuc=(kilo/(boy*boy));



                Intent intent=new Intent(getApplicationContext(),SonucActivity.class);
                intent.putExtra("deger",sonuc);
                startActivity(intent);

                }
            }
        });




    }
}



