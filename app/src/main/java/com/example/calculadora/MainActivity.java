package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button btnadicao;
    Button btnsub;
    Button btnmult;
    Button btndiv;
    TextView result;


    int n1, n2, adicao,sub,mult,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnadicao = (Button) findViewById(R.id.btnadicao);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmult = (Button) findViewById(R.id.btnmult);
        btndiv = (Button) findViewById(R.id.btndiv);
        result = (TextView) findViewById(R.id.result);


        btnadicao.setOnClickListener(view -> {
            n1 = Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num1.getText()));
            adicao=n1+n2;
            result.setText(String.valueOf(adicao));
        });


        btnsub.setOnClickListener(view -> {
            n1 = Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num1.getText()));
            sub = n1-n2;
            result.setText(String.valueOf(sub));
        });

        btnmult.setOnClickListener(view -> {
            n1 = Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num1.getText()));
            mult = n1*n2;
            result.setText(String.valueOf(mult));
        });


        btndiv.setOnClickListener(view -> {
            n1 = Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num1.getText()));
            div = n1/n2;
            result.setText(String.valueOf(div));
        });

    }
}