package com.example.tamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btn_sum = findViewById(R.id.btn_sum);
    Button btn_div = findViewById(R.id.btn_div);
    Button btn_mul = findViewById(R.id.btn_mul);
    final TextView txt_result=findViewById(R.id.txt_result);
    final EditText txt_first=findViewById(R.id.editText_first);
    final EditText txt_second=findViewById(R.id.editText_second);

    btn_sum.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String First = txt_first.getText().toString();
            String Second = txt_second.getText().toString();
            if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
                Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
                else {
                String f = txt_first.getText().toString();
                float first = Float.parseFloat(f);
                String s = txt_second.getText().toString();
                float second = Float.parseFloat(s);
                txt_result.setText(String.valueOf(first + second));
            }

        }
    });

    btn_mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String First = txt_first.getText().toString();
            String Second = txt_second.getText().toString();
            if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
                Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
            else {
                String f = txt_first.getText().toString();
                float first = Float.parseFloat(f);
                String s = txt_second.getText().toString();
                float second = Float.parseFloat(s);
                txt_result.setText(String.valueOf(first * second));
            }

        }
    });
btn_div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String First = txt_first.getText().toString();
        String Second = txt_second.getText().toString();
        if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
            Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
        else {
            String f = txt_first.getText().toString();
            float first = Float.parseFloat(f);
            String s = txt_second.getText().toString();
            float second = Float.parseFloat(s);
            txt_result.setText(String.valueOf(first / second));
        }

    }
});

    }



}
