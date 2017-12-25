package com.example.minhaj.viewholderinflator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data[]= {"Item1","Item2","Item3","Item4","Item5","Item6","Item7","Item8"};

        for(String str:data)
        {
            ListView view = (ListView) findViewById(R.id.list);
            Log.d(TAG, "onCreate:This is my tag " + str);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
            view.setAdapter(arrayAdapter);

        }
    }
}
