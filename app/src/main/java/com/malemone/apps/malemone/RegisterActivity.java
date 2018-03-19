package com.malemone.apps.malemone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;
    private TextView linkViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // opens main activity
        btnRegister = (Button) findViewById(R.id.button_register);
        btnRegister.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(i);
            finish();
        });

        // opens login user activity
        linkViewLogin = (TextView) findViewById(R.id.link_view_login);
        linkViewLogin.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
            finish();
        });
    }
}
