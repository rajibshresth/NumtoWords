package com.numtowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNum;
    TextView txtWord;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum= findViewById(R.id.etNum);
        txtWord= findViewById(R.id.txtWord);
        btnConvert= findViewById(R.id.btnConvert);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num;
                num= Integer.parseInt(etNum.getText().toString());

                NumtoWords numbertoWords= new NumtoWords(num);
                txtWord.setText(numbertoWords.Words());

            }
        });
    }
}