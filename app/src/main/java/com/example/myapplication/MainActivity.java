package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.myapplication.R.id.input_name;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name;
    EditText wishes;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //определяем переменные
        wishes = findViewById(R.id.wish);
        name = findViewById(R.id.input_name);
        submit = findViewById(R.id.submit);
        wishes.setText("vbk");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                //действия при нажатии на кнопку...
                wishes.setText("fhuiaer");
                break;
        }
    }
}
