package com.example.tesk3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int clickCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
    }

    public void click(View view) {
        clickCounter=clickCounter+1;
        if (clickCounter<6) {
            btn.setText("This is a click number: " + clickCounter);
        }
        else
        {
            btn.setText("Enough to click.Go to new start");
            clickCounter=0;
        }
    }
}