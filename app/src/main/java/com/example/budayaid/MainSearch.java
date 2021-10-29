package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainSearch extends AppCompatActivity {
    ListView list1;
    ArrayAdapter adapter;
    ArrayList<String>list;
    SearchView search1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);
        list1=(ListView)findViewById(R.id.list1);
        search1=(SearchView) findViewById(R.id.search1);
        list=new ArrayList<String>();
        list.add("Sumatera Utara");
        list.add("Sumatera Barat");
        list.add("Sulawesi Selatan");
        list.add("Jawa Timur");
        list.add("Jawa Tengah");
        list.add("DI.Yogyakarta");
        adapter=new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1);
        list1.setAdapter(adapter);
        search1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}