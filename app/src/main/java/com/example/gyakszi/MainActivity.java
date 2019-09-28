package com.example.gyakszi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button button_elso;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        button_elso.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent masodik_activity = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(masodik_activity);
                finish();
            }
        });
    }

    public void init()
    {
        button_elso = findViewById(R.id.button_elso);
    }
}
