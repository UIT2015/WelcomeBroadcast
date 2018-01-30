package com.smart_f.welcomebroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText input;
    private Button translate;
    private WelcomeBroadcast welcomeBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        input = findViewById(R.id.input);
        translate = findViewById(R.id.translate);
        welcomeBroadcast = WelcomeBroadcast.getInstance(this);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeBroadcast.welcomeBroadcast(input.getText().toString(),WelcomeBroadcast.COME);
            }
        });
    }
}
