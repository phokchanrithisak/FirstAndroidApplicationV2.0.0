package com.example.phokchanrithisak.firstandroidapplicationv200;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_KEY = "com.example.phokchanrithisak.firstandroidapplicationv200.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View v) {
        Intent connect = new Intent(MainActivity.this, DisplayMessageActivity.class);
        EditText edit = (EditText) findViewById(R.id.ediText);

        String mesSag = edit.getText().toString();
        connect.putExtra(EXTRA_MESSAGE_KEY, mesSag);
        startActivity(connect);
    }
}
