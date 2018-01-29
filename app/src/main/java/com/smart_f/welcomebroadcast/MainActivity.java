package com.smart_f.welcomebroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button translate;
    private WelcomeBroadcast a ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        translate = findViewById(R.id.translate);
        a = new WelcomeBroadcast(this);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.welcomeBroadcast(input.getText().toString(),WelcomeBroadcast.COME);
            }
        });

    }

}
