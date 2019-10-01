package com.pandev.academy.mysubmissionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_NICKNAME = "extra_nickname";
    public static final String EXTRA_SINCE = "extra_since";
    public static final String EXTRA_STADIUM = "extra_stadium";
    public static final String EXTRA_LEAGUE = "extra_league";
    public static final String EXTRA_MANAGER = "extra_manager";
    public static final String EXTRA_ABOUT = "extra_about";
    public static final String EXTRA_IMAGE = "extra_image";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvClubName = findViewById(R.id.tv_club_name);
        TextView tvClubNickName = findViewById(R.id.tv_club_julukan);
        TextView tvClubSince = findViewById(R.id.tv_club_since);
        TextView tvClubStadium = findViewById(R.id.tv_club_stadium);
        TextView tvClubLeague = findViewById(R.id.tv_club_liga);
        TextView tvClubManager = findViewById(R.id.tv_club_manager);
        TextView tvClubAbout = findViewById(R.id.tv_club_about);
        ImageView imgClubLogo = (ImageView) findViewById(R.id.img_item_logoClub);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nickname = getIntent().getStringExtra(EXTRA_NICKNAME);
        String since = getIntent().getStringExtra(EXTRA_SINCE);
        String stadium = getIntent().getStringExtra(EXTRA_STADIUM);
        String league = getIntent().getStringExtra(EXTRA_LEAGUE);
        String manager = getIntent().getStringExtra(EXTRA_MANAGER);
        String about = getIntent().getStringExtra(EXTRA_ABOUT);
        String imgae = getIntent().getStringExtra(EXTRA_IMAGE);

        Glide.with(this).load(imgae).into(imgClubLogo);
        tvClubName.setText(name);
        tvClubNickName.setText(": "+nickname);
        tvClubSince.setText(": "+since);
        tvClubStadium.setText(": "+stadium);
        tvClubLeague.setText(": "+league);
        tvClubManager.setText(": "+manager);
        tvClubAbout.setText(about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Club Detail");
        }

    }


}
