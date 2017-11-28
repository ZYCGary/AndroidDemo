package com.gary.a5_eventhandling;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button garysButton = findViewById(R.id.garysButton);

        garysButton.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    public void onClick(View v) {
                        TextView garysText = findViewById(R.id.garysText);
                        garysText.setText("On Click");
                    }
                }
        );

        garysButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @SuppressLint("SetTextI18n")
                    public boolean onLongClick(View v){
                        TextView garysText = findViewById(R.id.garysText);
                        garysText.setText("On Long Click");
                        return true;
                    }
                }
        );
    }
}
