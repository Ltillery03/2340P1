package com.example.to_do_list;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ExamMain extends AppCompatActivity {
    public void goBack(View v) {
        startActivity(new Intent(ExamMain.this, FirstFragment.class));
    }
}
