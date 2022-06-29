package com.softuniq.myfin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent= new Intent(getApplicationContext(),signup_activity.class);
            startActivity(intent);
        }
    });
    }
}