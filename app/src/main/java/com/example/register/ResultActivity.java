package com.example.register;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {


    private EditText name;
    private EditText account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String username = getSharedPreferences("test",MODE_PRIVATE)
                .getString("NAME","");
        this.name = findViewById(R.id.your_name);
        EditText name= this.name;
        name.setText(username);
        String userAccount = getSharedPreferences("test",MODE_PRIVATE)
                .getString("ACCOUNT","");
        account = findViewById(R.id.your_account);
        account.setText(userAccount);
        String userBirth = getSharedPreferences("test",MODE_PRIVATE)
                .getString("BIRTH","");
        EditText birth = findViewById(R.id.your_birth);
        birth.setText(userBirth);




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
