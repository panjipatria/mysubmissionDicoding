package com.pandev.academy.mysubmissionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class about_activity extends AppCompatActivity {

    public static final String EXTRA_NAMEABOUT = "extra_nameabout";
    public static final String EXTRA_EMAIL = "extra_email";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_activity);

        TextView tvNameAobout = findViewById(R.id.tv_about_name);
        TextView tvEmail = findViewById(R.id.tv_about_email);
        ImageView imgProfil = (ImageView) findViewById(R.id.img_profil);

        String name = getIntent().getStringExtra(EXTRA_NAMEABOUT);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        Integer image = getIntent().getIntExtra(EXTRA_IMAGE, 0);

        tvNameAobout.setText(name);
        tvEmail.setText(email);
        Glide.with(this).load(image).into(imgProfil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
        }

    }




}
