package com.example.divansigorta2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);  // eğer bunu koymazsak toolbardaki menu gidiyor


        NavHostFragment navHostFragment =(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navHostFragment.getNavController());

        //navigationView 'e tasarım kısmından menu klasörümüzdeki nav_menu 'yü ekledik.
        // ve tasarım kısmının kod kısmında navigationView 'e android:layout_gravity="start" ekledik sola kaydırdık
        // drawerLayouta ise tools:openDrawer="start" ekledik

        // bu alttaki kodu yazmazsak eğer yine navigationView açılır soldan ancak 3 çizgi olan toggle buton olmaz
        // Bu 3 satır kodda toolbardaki 3 çizgiyi oluşturduk ve onu dinlemesini söyledik

        // toggle butonu yapıyoruz drawer dinleyecek bunu ve ona göre çalışacak
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,0,0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        // navigation drawera başlık tasarımını ekliyoruz
        navigationView.inflateHeaderView(R.layout.navigation_drawer_baslik);


    }


    // Toolbar daki 3 nokatalı menüyü oluşturduk inflate ettik
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        return true;
    }

    // Toolbardaki itemlere basılırsa ne olsun onu yazdık
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_hakkimizda:
                Toast.makeText(getApplicationContext(),"Hakkımızda", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_ayarlar:
                Toast.makeText(getApplicationContext(), "Ayarlar", Toast.LENGTH_LONG).show();
                return true;
            default:
                return false;
        }
    }

    // Burda drawer açıksa ve kullanıcı geri tuşuna basarsa uygulama değilde drawer kapansın dedik
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}