package com.batman.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    String url="http://www.hottoys.com.hk/photos/PD1483440804E0M.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.image);

        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(imageView);
    }
}
