package com.example.phokchanrithisak.firstandroidapplicationv200;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.phokchanrithisak.firstandroidapplicationnv200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View v){
        Intent i = new Intent (MainActivity.this, DisplayMessageActivity.class);
        EditText edit = (EditText) findViewById(R.id.ediText);

        String message = edit.getText().toString();
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);
    }
}
