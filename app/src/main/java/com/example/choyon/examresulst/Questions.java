package com.example.choyon.examresulst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Questions extends AppCompatActivity  {
    Button b;
    int score;
    boolean one  = false,two=false,three=false,four=false;
    String name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        Intent intent = getIntent();
        name =  intent.getStringExtra("Name");
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

        b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(one)
                    score++;
                if(two)
                    score++;
                if(three)
                    score++;
                if(four)
                    score++;
                Intent intent = new Intent(Questions.this,Score.class);
                intent.putExtra("Name",name);
                String score1 = Integer.toString(score);
                intent.putExtra("Value",score1);

                startActivity(intent);
            }
        });
    }


    public void option(View v) {
        int id_ = v.getId();
        switch (id_)
        {
            case R.id.optionOne:
            {
                one = true;
//                Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.optionTwo:
            {
//                Toast.makeText(getApplicationContext(),"Two",Toast.LENGTH_SHORT).show();
                break;

            }case R.id.op3:{

//            Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_SHORT).show();
            break;
        }
            case R.id.op4:
            {
//                Toast.makeText(getApplicationContext(),"Four",Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;
        }
    }

    public void opt2(View v) {
        int id_ = v.getId();
        switch (id_)
        {
            case R.id.q21:
            {
//                one = true;
//                Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.q22:
            {
                two = true;
//                Toast.makeText(getApplicationContext(),"Two",Toast.LENGTH_SHORT).show();
                break;

            }case R.id.q23:{

//            Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_SHORT).show();
            break;
        }
            case R.id.q24:
            {
//                Toast.makeText(getApplicationContext(),"Four",Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;
        }
    }
    public void opt3(View v) {
        int id_ = v.getId();
        switch (id_)
        {
            case R.id.q31:
            {
//                one = true;
//                Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.q32:
            {
//                Toast.makeText(getApplicationContext(),"Two",Toast.LENGTH_SHORT).show();
                break;

            }case R.id.q33:{
                three = true;
//            Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_SHORT).show();
            break;
        }
            case R.id.q34:
            {
//                Toast.makeText(getApplicationContext(),"Four",Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;
        }
    }
    public void opt4(View v) {
        int id_ = v.getId();
        switch (id_)
        {
            case R.id.q41:
            {
//                one = true;
//                Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.q42:
            {
//                Toast.makeText(getApplicationContext(),"Two",Toast.LENGTH_SHORT).show();
                break;

            }case R.id.q43:{

//            Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_SHORT).show();
            break;
        }
            case R.id.q44:
            {
                four = true;
//                Toast.makeText(getApplicationContext(),"Four",Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;
        }
    }



}
