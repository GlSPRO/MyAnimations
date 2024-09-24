package com.example.myanymations;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toFrameAnimationActivity = findViewById(R.id.toFrameAnimationActivity);
        Button toTweenAnimationActivity = findViewById(R.id.toTweenAnimationActivity);

        toFrameAnimationActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
            startActivity(intent);
        });

        toTweenAnimationActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
            startActivity(intent);
        });
    }
}
