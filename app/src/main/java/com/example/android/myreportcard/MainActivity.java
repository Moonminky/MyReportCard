package com.example.android.myreportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new ReportCard
        ReportCard cat = new ReportCard(2017, "Cat", 5, 2, 1, 3, 1);
        String Music = cat.getMusic().toString();
        String catReport = cat.toString();

        final TextView test1 = (TextView) findViewById(R.id.testing1);
        test1.setText(catReport);

    }
}
