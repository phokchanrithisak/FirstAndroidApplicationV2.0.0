package com.example.phokchanrithisak.firstandroidapplicationv200;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent i = getIntent();
        String recieveMessage = i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView disMes = (TextView) findViewById(R.id.disMes);
        disMes.setText(recieveMessage);
    }
}
