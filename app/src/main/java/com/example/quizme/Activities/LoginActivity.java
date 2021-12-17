package com.example.quizme.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizme.R;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView username = findViewById(R.id.username_edittext);
        TextView password = findViewById(R.id.password_edittext);

        MaterialButton loginButton = findViewById(R.id.login_button);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if username matches the db. if so, check the isPassword() function as to whether right password
                // idk man just copy heebit
            }
        });

    }
}
