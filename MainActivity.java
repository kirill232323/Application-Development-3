package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class M {
    ArrayList<Movie> movies;
}

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    ArrayList<String> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movies = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.movies)));
        textView = findViewById(R.id.textView);
    }
    public void clickButton(View v) throws IOException {
        String res;
        int a = (int)(Math.random()*movies.size());
        if (movies.isEmpty()) {
            res = "Фильмы закончились!";
            textView.setText((CharSequence) res);
        }
        else {
            res = movies.get(a);
            textView.setText((CharSequence)res);
            movies.remove(a);
        }
    }
}