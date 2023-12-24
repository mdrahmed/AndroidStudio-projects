package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        Intent intent = getIntent();
        String message = intent.getStringExtra("Extra_Message");
        TextView textView = findViewById(R.id.desplayMessage);
        textView.setText(message);
    }

    public void openFinalActivity(View view) {

        startActivity(new Intent(this, Final_activity.class));

    }
}
