/*
Ghassan Matti
Angel Garcia
Juan Chavez
Isaiah Boblett
*/

package com.ghassan_jobran.rideshareex;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.ghassan_jobran.rideshareex.Gas_Activity;
import com.ghassan_jobran.rideshareex.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gasButtonn = findViewById(R.id.gasButton);
        //Button foodButtonn = findViewById(R.id.foodButton);
        //Button mileageButtonn = findViewById(R.id.mileageButton);
        //Button otherButtonn = findViewById(R.id.otherButton);

        gasButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gas_Activity.class);
                startActivity(intent);
                return;
            }
        });
/*
        foodButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), FoodActivity.class);
               startActivity(intent);
               return;
            }
        });


         mileageButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MileageActivity.class);
                startActivity(intent);
                return;
            }
        });

        otherButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OtherActivity.class);
                startActivity(intent);
                return;
            }
        });
*/

        /*listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Gas");
        arrayList.add("Food");
        arrayList.add("Oil Change");
        arrayList.add("Mileage");
        arrayList.add("Other");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);*/
    }
}