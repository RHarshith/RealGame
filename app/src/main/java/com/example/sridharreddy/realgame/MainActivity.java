package com.example.sridharreddy.realgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private EditText no1;
    private EditText no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        no1=(EditText)findViewById(R.id.num1);
        no2=(EditText) findViewById(R.id.num2);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                int sum;
                int a=Integer.parseInt(String.valueOf(no1.getText()));
                int b=Integer.parseInt(String.valueOf(no2.getText()));
                sum=a+b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();

        }
    }
}
