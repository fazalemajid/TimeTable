package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Time Tables");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button cs = findViewById(R.id.btn_cs);
        cs.setOnClickListener(this);
        Button se = findViewById(R.id.btn_se);
        se.setOnClickListener(this);
        Button ce = findViewById(R.id.btn_ce);
        ce.setOnClickListener(this);
        Button me = findViewById(R.id.btn_me);
        me.setOnClickListener(this);
        Button ee = findViewById(R.id.btn_ee);
        ee.setOnClickListener(this);
        Button bba = findViewById(R.id.btn_bba);
        bba.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.available_classes) {
            // Handle the camera action
        } else if (id == R.id.reserved_classes) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.btn_cs){
            intent = new Intent(this, CSActivity.class);
        }else if (v.getId() == R.id.btn_se){
            intent = new Intent(this, SEActivity.class);
        }else if (v.getId() == R.id.btn_ce){
            intent = new Intent(this, CEActivity.class);
        }else if (v.getId() == R.id.btn_me){
            intent = new Intent(this, MEActivity.class);
        }else if (v.getId() == R.id.btn_ee){
            intent = new Intent(this, EEActivity.class);
        }else{
            intent = new Intent(this, BBAActivity.class);
        }
        startActivity(intent);
    }
}
