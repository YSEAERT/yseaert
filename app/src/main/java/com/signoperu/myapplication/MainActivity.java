package com.signoperu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button MIBOTON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MIBOTON = findViewById(R.id.button);
        MIBOTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrir2 = new Intent (getApplicationContext(),Main2Activity.class);
                startActivity(abrir2);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_uno,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.opcion1:
                Intent v1 = new Intent(this,MainActivity.class);
                startActivity(v1);
                return true;
            case R.id.opcion2:
                Intent v2 = new Intent(this,Main2Activity.class);
                startActivity(v2);
                return true;
            case R.id.opcion3:
                Intent v3 = new Intent(this,Main3Activity.class);
                startActivity(v3);
                return true;
            case R.id.opcion4:
                Intent v4 = new Intent(this,Main4Activity.class);
                startActivity(v4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

