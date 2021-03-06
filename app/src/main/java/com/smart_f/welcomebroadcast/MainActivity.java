package com.smart_f.welcomebroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button translate;
    private Button jump;
    private WelcomeBroadcast welcomeBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        translate = findViewById(R.id.translate);
        jump = findViewById(R.id.jump);
        welcomeBroadcast = WelcomeBroadcast.getInstance(this);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeBroadcast.welcomeBroadcast(input.getText().toString(),WelcomeBroadcast.COME);
            }
        });

        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }

}
