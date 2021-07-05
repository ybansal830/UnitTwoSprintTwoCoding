package com.myfirst.ft_and_03u_2c_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    private EditText mEtOne,mEtTwo;
    private Button mBtOne,mBtTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mEtOne = findViewById(R.id.etOne);
        mEtTwo = findViewById(R.id.etTwo);
        mBtOne = findViewById(R.id.btOne);
        mBtTwo = findViewById(R.id.btTwo);
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputValidation()) {
                    Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                    intent.putExtra("name", mEtOne.getText().toString());
                    startActivity(intent);
                }
            }
        });
        mBtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
    private boolean inputValidation() {
        if (mEtOne.getText().toString().length() < 4) {
            mEtOne.setError("minimum 4 characters needed");
            return false;
        }
        if (mEtTwo.getText().toString().length() < 6) {
            mEtTwo.setError("password is weak");
            return false;
        }
        return true;
    }
}