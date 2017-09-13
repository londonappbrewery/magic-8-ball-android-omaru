package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballImage = (ImageView)findViewById(R.id.ball_image);
        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final Random random = new Random();
        ballImage.setImageResource(balls[random.nextInt(5)]);
        ballImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ballImage.setImageResource(balls[random.nextInt(5)]);
            }
        });
    }
}
