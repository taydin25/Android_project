package com.example.hwler;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class show extends AppCompatActivity {
    TextView result2;
    TextView comment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        result2=findViewById(R.id.result2);
        comment2=findViewById(R.id.comment2);
        Intent receiveIntent = this.getIntent();
        double bmi2 =receiveIntent.getDoubleExtra("bmi2",0);
        result2.setText("= "+bmi2);
        if (bmi2 <= 18.5)  comment2.setText("Underweight");
        else if (bmi2 <= 24.9 && bmi2 > 18.5) comment2.setText("Normal");
        else if (bmi2 <= 29.9 && bmi2 > 24.9) comment2.setText("Overweight");
        else if (bmi2 >= 30) comment2.setText("Obese");
    }
}