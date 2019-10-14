package com.pandev.academy.mysubmissionapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvClubFootball;
    private ArrayList<ClubFootball> list = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClubFootball = findViewById(R.id.rv_footballClub);
        rvClubFootball.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerList();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Football Club");
        }
    }

    private void showRecyclerList(){
        rvClubFootball.setLayoutManager(new LinearLayoutManager(this));
        ListClubFootballAdapter listClubFootballAdapter = new ListClubFootballAdapter(list);
        rvClubFootball.setAdapter(listClubFootballAdapter);

        listClubFootballAdapter.setOnClickCallBack((new ListClubFootballAdapter.OnClickCallBack() {
            @Override
            public void onItemClicked(ClubFootball data) {

            showSelectedClubFootball(data);


            }
        }));
    }

    private void showSelectedClubFootball(ClubFootball clubFootball) {
        //Toast.makeText(this, "Tetep Ini " +clubFootball.getClubName() , Toast.LENGTH_SHORT).show();
        Intent moveActivity = new Intent(MainActivity.this, DetailActivity.class);
        moveActivity.putExtra(DetailActivity.EXTRA_NAME, clubFootball.getClubName());
        moveActivity.putExtra(DetailActivity.EXTRA_NICKNAME, clubFootball.getClubNickName());
        moveActivity.putExtra(DetailActivity.EXTRA_SINCE, clubFootball.getClubSince());
        moveActivity.putExtra(DetailActivity.EXTRA_STADIUM, clubFootball.getClubStadium());
        moveActivity.putExtra(DetailActivity.EXTRA_LEAGUE, clubFootball.getClubLeague());
        moveActivity.putExtra(DetailActivity.EXTRA_MANAGER, clubFootball.getClubManager());
        moveActivity.putExtra(DetailActivity.EXTRA_ABOUT, clubFootball.getClubAbout());
        moveActivity.putExtra(DetailActivity.EXTRA_IMAGE, clubFootball.getClubPhoto());
        startActivity(moveActivity);
    }

    //menu

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {

        switch (itemId) {
            case R.id.action_about:
                showAbout();
                break;
            case R.id.exit:
                exit();
                break;
        }

    }

    private void showAbout(){

        Intent aboutActivity = new Intent(MainActivity.this, about_activity.class);
        aboutActivity.putExtra(about_activity.EXTRA_NAMEABOUT, "PANJI PATRIA");
        aboutActivity.putExtra(about_activity.EXTRA_EMAIL, "panjinohnah@gmail.com");
        aboutActivity.putExtra(about_activity.EXTRA_IMAGE, R.drawable.ipan);
        startActivity(aboutActivity);

    }

    private void exit(){
        finish();
    }

}
