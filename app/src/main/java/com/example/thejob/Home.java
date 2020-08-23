package com.example.thejob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar too = findViewById(R.id.memobaar);

        setSupportActionBar(too);
        drawerLayout = findViewById(R.id.drawerhome);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        androidx.appcompat.app.ActionBarDrawerToggle toggle;

        toggle = new ActionBarDrawerToggle(this, drawerLayout, too, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {drawerLayout.closeDrawer(GravityCompat.START);}
        else {

            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        if (menuItem.getItemId()==R.id.nav_depart)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new Departmentfrag()).commit();
            Toast.makeText(getApplicationContext(),"welcom to Departments",Toast.LENGTH_LONG).show();

        }
        if (menuItem.getItemId()==R.id.nav_home)
        {getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new HomeFragment()).commit();}
        if (menuItem.getItemId()==R.id.courses)
        {getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new Courses()).commit();}
        if (menuItem.getItemId()==R.id.s_in)
        {getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new LoginFrag()).commit();}
        if (menuItem.getItemId()==R.id.about)
        {getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new About_us_fragment()).commit();}
        if (menuItem.getItemId()==R.id.contact)
        {getSupportFragmentManager().beginTransaction().replace(R.id.containerfrag,new Contact()).commit();}

        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }



}
