package com.rajsabari.autocompletextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
 String [] course={"C","C++","Java","Android","Html"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView ao=findViewById(R.id.te);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,course);
        ao.setThreshold(1);
        ao.setAdapter(adapter);
    }
}