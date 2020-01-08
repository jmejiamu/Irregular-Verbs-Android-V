package com.softwareforeverybody.i_learnen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivityIlearn extends AppCompatActivity {
    private VerbsCollection verbsCollection = new VerbsCollection();
    private ColorChooser colorChooser = new ColorChooser();
    // View Variables

    private TextView iLearnTextView;
    private Button showVerbButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ilearn);

        // assign the view form the layoutfile to the corresponding variable
        iLearnTextView = (TextView)findViewById(R.id.iLearnTextView);
        showVerbButton = (Button)findViewById(R.id.showVerbButton);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verb = verbsCollection.getVerbs();

                // Update the screen with a new verb
                iLearnTextView.setText(verb);

                int color = colorChooser.getColors();
                relativeLayout.setBackgroundColor(color);
                showVerbButton.setTextColor(color);
            }
        };
        showVerbButton.setOnClickListener(listener);
    }
}
