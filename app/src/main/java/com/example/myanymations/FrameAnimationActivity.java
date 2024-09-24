package com.example.myanymations;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimationActivity extends AppCompatActivity {
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView animationIV = findViewById(R.id.imageView);
        Button startBtn = findViewById(R.id.startButton);
        Button pauseBtn = findViewById(R.id.pauseButton);
        Button BackBtn = findViewById(R.id.buttonBack);

        animationIV.setBackgroundResource(R.drawable.animation_rabbit);
        frameAnimation = (AnimationDrawable) animationIV.getBackground();

        startBtn.setOnClickListener(v -> {
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(v -> {
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });

        BackBtn.setOnClickListener(v -> {
            {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            };
        });
    }
}
