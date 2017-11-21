package com.example.choyon.examresulst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    String name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.name);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();

//                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Questions.class);
                 intent.putExtra("Name",name);

                startActivity(intent);
            }
        });
    }
}
