package com.example.ayush.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean check = true;
    boolean firsttime = true;

    public void fade(View view)
    {
        Log.i("Info", "Image Tapped");
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        if(check && firsttime)
        {
            imageView.animate().alpha(0).setDuration(2000);
            imageView.animate().translationYBy(1500).scaleX(0.1f).scaleY(0.1f).rotation(720).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            check = false;
            firsttime = false;
        }
        else if(check)
        {
            imageView.animate().alpha(0).setDuration(2000);
            imageView.animate().translationYBy(1500).scaleX(0.1f).scaleY(0.1f).rotation(720).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            imageView2.animate().translationYBy(-1500).scaleX(1).scaleY(1).setDuration(2000);
            check = false;
        }
        else
        {
            imageView2.animate().alpha(0).setDuration(2000);
            imageView2.animate().translationYBy(1500).scaleX(0.1f).scaleY(0.1f).rotation(720).setDuration(2000);
            imageView.animate().alpha(1).setDuration(2000);
            imageView.animate().translationYBy(-1500).scaleX(1).scaleY(1).setDuration(2000);
            check = true;
        }
        imageView.setRotation(0);
        imageView2.setRotation(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
