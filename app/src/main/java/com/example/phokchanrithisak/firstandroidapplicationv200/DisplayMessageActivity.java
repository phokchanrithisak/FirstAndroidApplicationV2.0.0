package com.example.phokchanrithisak.firstandroidapplicationv200;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent recieveIntent = getIntent();
        String revieveMessage = recieveIntent.getStringExtra(MainActivity.EXTRA_MESSAGE_KEY);

        TextView viewMessage = (TextView) findViewById(R.id.disMes);
        viewMessage.setText(revieveMessage);
    }
}
