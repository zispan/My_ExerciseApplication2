package com.example.my_exerciseapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// δημιουργια αντικειμενων
        EditText editText = findViewById(R.id.editText);
        Button btn = findViewById(R.id.btn);
        TextView textView = findViewById(R.id.textView);


// μεθοδος λειτουργιας button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String txt =  editText.getText().toString();
              textView.setText(txt.toUpperCase(Locale.ROOT));
/* προβολη debugging log
                Log.d("tag",txt);
                */


            }
        });
    }
}