package com.varshayadv.booklistingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView we = (TextView) findViewById(R.id.wel);

        we.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent wIntent = new Intent(MainActivity.this, List.class);
                startActivity(wIntent);
            }
        });

    }
}
