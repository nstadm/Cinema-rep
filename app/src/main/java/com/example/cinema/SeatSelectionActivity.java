package com.example.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class SeatSelectionActivity extends AppCompatActivity {

    private String movieTitle;
    private String moviePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        movieTitle = getIntent().getStringExtra("MOVIE_TITLE");
        moviePrice = getIntent().getStringExtra("MOVIE_PRICE");

        LinearLayout seatLayout = findViewById(R.id.seat_layout);
        for (int i = 0; i < seatLayout.getChildCount(); i++) {
            if (seatLayout.getChildAt(i) instanceof LinearLayout) {
                LinearLayout row = (LinearLayout) seatLayout.getChildAt(i);
                for (int j = 0; j < row.getChildCount(); j++) {
                    Button seatButton = (Button) row.getChildAt(j);
                    seatButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String seatNumber = seatButton.getText().toString();
                            Intent intent = new Intent(SeatSelectionActivity.this, ConfirmationActivity.class);
                            intent.putExtra("MOVIE_TITLE", movieTitle);
                            intent.putExtra("MOVIE_PRICE", moviePrice);
                            intent.putExtra("SEAT_NUMBER", seatNumber);
                            startActivity(intent);
                        }
                    });
                }
            }
        }
    }
}
