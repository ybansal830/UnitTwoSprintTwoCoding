package com.myfirst.ft_and_03u_2c_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText mEtOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mEtOne = findViewById(R.id.etOne);
        mEtOne.setText(getIntent().getStringExtra("name"));
    }
}