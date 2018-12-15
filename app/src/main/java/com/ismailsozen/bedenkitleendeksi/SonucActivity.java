package com.ismailsozen.bedenkitleendeksi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {

    private TextView textViewSonuc,textViewAciklama;
    private ImageView imageViewSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        textViewSonuc=findViewById(R.id.textViewSonuc);
        imageViewSonuc=findViewById(R.id.imageViewSonuc);
        textViewAciklama=findViewById(R.id.textViewAciklama);

        Intent intent=getIntent();
        Double sonuc= intent.getDoubleExtra("deger",0);

        textViewSonuc.setText("SONUÇ :"+String.valueOf(sonuc));


        if (sonuc>=0 && sonuc <=18.4)
        {
            imageViewSonuc.setImageResource(R.drawable.zayif);
            textViewAciklama.setText("Zayıfsınız !");

        }

        if (sonuc>=18.5 && sonuc <=24.9)
        {
            imageViewSonuc.setImageResource(R.drawable.saglikli);
            textViewAciklama.setText("Normalsiniz !");

        }

        if (sonuc>=25 && sonuc <=29.9)
        {
            imageViewSonuc.setImageResource(R.drawable.obez);
            textViewAciklama.setText("Fazla Kilolusunuz !");

        }

        if (sonuc>=30 && sonuc <=34.9)
        {
            imageViewSonuc.setImageResource(R.drawable.obez);
            textViewAciklama.setText("Obez 1.Sınıf !");

        }

        if (sonuc>=35 && sonuc <=44.9)
        {
            imageViewSonuc.setImageResource(R.drawable.obez);
            textViewAciklama.setText("Obez 2.Sınıf !");

        }

        if (sonuc>=45)
        {
            imageViewSonuc.setImageResource(R.drawable.obez);
            textViewAciklama.setText("Aşırı Obez !");

        }


    }
}
