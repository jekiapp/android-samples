package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.muzakki.ahmad.helper.Constant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.txtTest);
        txt.setText(Constant.HOST);
    }
}
