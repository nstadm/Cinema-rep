package com.example.cinema;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        String movieTitle = getIntent().getStringExtra("MOVIE_TITLE");
        String moviePrice = getIntent().getStringExtra("MOVIE_PRICE");
        String seatNumber = getIntent().getStringExtra("SEAT_NUMBER");

        TextView movieTitleView = findViewById(R.id.selected_movie);
        TextView moviePriceView = findViewById(R.id.selected_price);
        TextView seatNumberView = findViewById(R.id.selected_seat);

        movieTitleView.setText(movieTitle);
        moviePriceView.setText(moviePrice);
        seatNumberView.setText(seatNumber);
    }
}
