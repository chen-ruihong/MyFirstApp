package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    public void onChange(View view) {
        EditText editText = (EditText) findViewById(R.id.editText3);
        TextView textView = (TextView) findViewById(R.id.textView2);
        if (editText.getText().toString().equals("")) {
            textView.setText("输入内容不能为空！！！");
        } else {
            textView.setText(editText.getText().toString());
        }
    }
}
