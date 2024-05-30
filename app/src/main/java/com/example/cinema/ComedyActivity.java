package com.example.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ComedyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy);

        setupMovieClickListener(R.id.image_king_of_staten_island, "THE KING OF STATEN ISLAND", "450 ГРН");
        setupMovieClickListener(R.id.image_dont_look_up, "DON'T LOOK UP", "550 ГРН");
        setupMovieClickListener(R.id.image_palm_springs, "PALM SPRINGS", "500 ГРН");
        setupMovieClickListener(R.id.image_free_guy, "FREE GUY", "450 ГРН");
    }

    private void setupMovieClickListener(int imageViewId, final String movieTitle, final String moviePrice) {
        View movieImageView = findViewById(imageViewId);
        movieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComedyActivity.this, SeatSelectionActivity.class);
                intent.putExtra("MOVIE_TITLE", movieTitle);
                intent.putExtra("MOVIE_PRICE", moviePrice);
                startActivity(intent);
            }
        });
    }
}
