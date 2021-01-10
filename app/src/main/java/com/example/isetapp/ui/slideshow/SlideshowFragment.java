package com.example.isetapp.ui.slideshow;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.isetapp.R;

// hadhi mta3 classe
public class  SlideshowFragment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init the CardView
        CardView cardView = (CardView) findViewById(R.id.card_view);
        cardView.setRadius(20F); // set corner radius value
        // Implement onClickListener event on CardView
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SlideshowFragment.this, "CardView clicked event ", Toast.LENGTH_LONG).show();
            }
        });

    }
}
