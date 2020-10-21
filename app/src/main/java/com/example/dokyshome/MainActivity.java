package com.example.dokyshome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        @0verride
        protected void OnCreate(Bundle savedInstanceState);
        Super.Oncreate(savedInstanceState);
        Setcontent view(R.layout.Activity_main);

        @0verride
        public boolean onCreateOptionsMenu( menu menu)
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;

        @0verride
        public boolean onOptionsItemSelected(menuItem item)

        switch (item.getItemId )
        case R.id.mContacto:
        Intent intend=new intent(this,ActivityContacto.class);
        StartActivity(Intent);
        break;
        case R.id.mAbout:
        Intent intend=new intent(this,ActivityAbout.class);
        StartActivity(I);

        break;



        return super.onOptionsItemSelected(item);
    }
}