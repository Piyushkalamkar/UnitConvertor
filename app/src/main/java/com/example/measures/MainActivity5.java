package com.example.measures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button btn9;
    EditText edt4;
    TextView texts4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn9=findViewById(R.id.button9);
        edt4=findViewById(R.id.gram);
        texts4 =findViewById(R.id.tv4);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s3=edt4.getText().toString();
                double gramm=Integer.parseInt(s3);
                double kg=gramm/1000;
                texts4.setText("The Value "+gramm+" gram is "+kg+" kg");
            }
        });
    }
}