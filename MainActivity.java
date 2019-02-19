    package com.example.akshay.customizedlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView textV;
    String Mname[] = {"Akshay","Akash","Ganesh","Vivek","Sameer","Wilson"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list_id);
        textV = findViewById(R.id.text_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.man_name,R.id.text_id,Mname);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getName = lv.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,""+getName,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
