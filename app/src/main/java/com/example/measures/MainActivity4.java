package com.example.measures;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    Button btn8;
    EditText edt2;
    TextView txtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn8=findViewById(R.id.button8);
        edt2=findViewById(R.id.ml);
        txtv2=findViewById(R.id.tv3);

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                String s2=edt2.getText().toString();
                double mil=Integer.parseInt(s2);
                double li=mil/1000;
                txtv2.setText("The Liter value is: "+li+" liter");
            }
        });
    }
}