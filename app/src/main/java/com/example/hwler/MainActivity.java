package com.example.hwler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText hetext;
    EditText wetext;
    Button calculatebtn;
    TextView result;
    TextView comment;
    double height;
    double weight;
    double bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning identities
        hetext=findViewById(R.id.he);
        wetext=findViewById(R.id.we);
        calculatebtn=(Button) findViewById(R.id.btn_cal);

        //button click
        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assigning variables
                height=Double.parseDouble(hetext.getText().toString());
                weight=Double.parseDouble(wetext.getText().toString());
                bmi=weight*10000.0/(height*height);
                bmi = (double)(Math.round(bmi * 10))/10.0;
                Intent intent = new Intent(MainActivity.this,show.class);
                intent.putExtra("bmi2",bmi);
                startActivity(intent);
            }



        });

    }
}