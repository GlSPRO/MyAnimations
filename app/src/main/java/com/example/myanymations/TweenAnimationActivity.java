package com.example.myanymations;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        ImageView imageViewTween = findViewById(R.id.imageViewTween);
        Button startTweenButton = findViewById(R.id.startTweenButton);
        Button BackBtn = findViewById(R.id.Backbutton);


        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        startTweenButton.setOnClickListener(v -> imageViewTween.startAnimation(tweenAnimation));

        BackBtn.setOnClickListener(v -> {
            {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            };
        });
    }
}
