package com.example.choyon.examresulst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String Value = intent.getStringExtra("Value");
        textView1 = (TextView)findViewById(R.id.textView2);
        textView2 = (TextView)findViewById(R.id.textView6);
       // MainActivity m = new MainActivity();
        //Questions q = new Questions();
        textView2.setText(Value);
        textView1.setText(name);

    }

}
