package com.example.to_do_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CourseMain extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main);
    }
    public void goBack(View v) {
        startActivity(new Intent(CourseMain.this, FirstFragment.class));
    }
}
