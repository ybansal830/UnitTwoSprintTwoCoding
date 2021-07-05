package com.myfirst.ft_and_03u_2c_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mTvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvTwo = findViewById(R.id.tvTwo);
        mTvTwo.setText(getIntent().getStringExtra("name"));
    }
}