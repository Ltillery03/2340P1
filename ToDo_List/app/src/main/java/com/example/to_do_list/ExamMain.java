package com.example.to_do_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ExamMain extends AppCompatActivity {

    public void goBack(View v) {
        startActivity(new Intent(ExamMain.this, FirstFragment.class));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam_main);

        Button createNewExamButton = findViewById(R.id.AddNew);
        createNewExamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open a dialog or start a new activity to capture exam details
                showCreateExamActivity();
            }
        });
    }

    private void showCreateExamActivity() {
        // Implementation for showing a custom dialog or starting a new activity
        // For example, startActivity(new Intent(this, CreateExamActivity.class));
        startActivity(new Intent(ExamMain.this,CreateExamActivity.class));
    }

}
