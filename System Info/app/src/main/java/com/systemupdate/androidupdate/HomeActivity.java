package com.systemupdate.androidupdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends AppCompatActivity {


    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "System Update", "Software Update",

    };



    int[] listviewImage = new int[]{
            R.drawable.updateicon, R.drawable.updateicon,
    };

    String[] listviewShortDescription = new String[]{
            "Details and information about System updation", "Details and information about OS updation",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<HashMap<String,String>> arrayList= new ArrayList<HashMap<String, String>>();


        for (int i = 0; i <2; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            arrayList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), arrayList, R.layout.activity_listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);

        //perform listView item click event
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent sys = new Intent(view.getContext(), SystemActivity.class);
                        startActivity(sys);
                        break;
                    case 1:
                        Intent os = new Intent(view.getContext(), MainActivity.class);
                        startActivity(os);
                        break;

            }
        }
        });
    }
}



