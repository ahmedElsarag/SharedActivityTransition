package com.example.sharedactivitytransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.mainActivity);
        imageView = findViewById(R.id.img);
        textView  =findViewById(R.id.txt);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pair<View, String> p1 = Pair.create((View) imageView, "imgTrans");
                Pair<View, String> p2 = Pair.create((View) textView, "txtTrans");

                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,p1,p2);

                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent,activityOptions.toBundle());
            }
        });
    }
}
