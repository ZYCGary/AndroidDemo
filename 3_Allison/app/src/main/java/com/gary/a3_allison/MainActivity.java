package com.gary.a3_allison;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"ResourceType", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //Layout
        RelativeLayout garysLayout = new RelativeLayout(this);
        garysLayout.setBackgroundColor(Color.GREEN);

        //Button
        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);

        //Username input
        EditText username = new EditText(this);

        //Set widget ID
        redButton.setId(1);
        username.setId(2);

        //Set button rules
        RelativeLayout.LayoutParams buttonDetaild = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Set username rules
        RelativeLayout.LayoutParams usernameDetail = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Give rules to position widget
        usernameDetail.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetail.setMargins(0, 0, 0, 50);

        buttonDetaild.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetaild.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();

        //Convert DIP into pixel
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics());

        username.setWidth(px);

        //Add widget to layout(button is now a child of layout)
        garysLayout.addView(redButton, buttonDetaild);
        garysLayout.addView(username, usernameDetail);

        //Set this activities content/Display to this view
        setContentView(garysLayout);
    }
}
