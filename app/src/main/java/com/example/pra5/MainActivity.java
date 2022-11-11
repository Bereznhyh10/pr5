package com.example.pra5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    String[] things = ("Рубик", "Иллюзия", "Картинка", "Часы",);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(context: this, android.R.layout.simple_list_item_1, things);
        setlistAdapter(adapter);
        AdapterView.OnItemClickListener itemlistener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }


        }

    }
}