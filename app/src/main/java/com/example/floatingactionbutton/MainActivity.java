package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    int imageIndex = 0;
    ImageView collapsingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collapsingImageView =  findViewById(R.id.collapsingImageView);

        loadCollapsingImage(imageIndex);




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                if (imageIndex == 3) {
                    imageIndex = 0;

                } else {

                }
            }
        });
    }


    private void loadCollapsingImage(int i) {
        TypedArray array = getResources().obtainTypedArray(R.array.images);
        collapsingImageView.setImageDrawable(array.getDrawable(i));
    }

}
