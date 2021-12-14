package com.example.graduation5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
    EditText userid;

    public void Clicked(View v){
        Toast.makeText(this,"반성문! 글로 벌을 주자!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        userid = findViewById(R.id.userid);
        Button loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });
    }

    public void loginProcess(View v) {
        String uid = userid.getText().toString();
        if (uid.equals("GLOBAL")) {
            Intent intent = new Intent(SubActivity.this,Last.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "땡!", Toast.LENGTH_LONG).show();
            userid.setText("");
        }
    }
}