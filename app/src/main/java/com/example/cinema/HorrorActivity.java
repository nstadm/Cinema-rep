package com.example.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class HorrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);

        setupMovieClickListener(R.id.image_king_of_staten_island, "A QUIET PLACE PART II (2020)", "400 ГРН");
        setupMovieClickListener(R.id.image_dont_look_up, "HEREDITARY (2018)", "550 ГРН");
        setupMovieClickListener(R.id.image_palm_springs, "THE RITUAL (2017)", "450 ГРН");
        setupMovieClickListener(R.id.image_free_guy, "THE INVISIBLE MAN (2020)", "500 ГРН");
    }

    private void setupMovieClickListener(int imageViewId, final String movieTitle, final String moviePrice) {
        View movieImageView = findViewById(imageViewId);
        movieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HorrorActivity.this, SeatSelectionActivity.class);
                intent.putExtra("MOVIE_TITLE", movieTitle);
                intent.putExtra("MOVIE_PRICE", moviePrice);
                startActivity(intent);
            }
        });
    }
}
