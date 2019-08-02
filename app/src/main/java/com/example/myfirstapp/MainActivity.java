package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    int size = 30;
    public void bigger(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(++size);
    }

    public void small(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(--size);
    }

    public void display(View view){
        EditText editText = findViewById(R.id.editText2);
        TextView textView = findViewById(R.id.textView);
        textView.setText(editText.getText().toString());
    }
}
