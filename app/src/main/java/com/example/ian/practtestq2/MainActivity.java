package com.example.ian.practtestq2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

                                 import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> ad;
    Spinner sp;
    boolean test = false;
    Menu myMenu = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner) findViewById(R.id.ct);

        ad = ArrayAdapter.createFromResource(this, R.array.contact, android.R.layout.simple_spinner_dropdown_item);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



                    Toast.makeText(getApplicationContext(), sp.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();



            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        this.myMenu = menu;


        getMenuInflater().inflate(R.menu.menu, menu);


        return true;
    }


    public boolean onOptionsItemSelected(MenuItem menu) {

        if (menu.getItemId() == R.id.hide) {
            this.myMenu.setGroupVisible(R.id.hid, false);
        } else if (menu.getItemId() == R.id.show) {
            this.myMenu.setGroupVisible(R.id.hid, true);
        }
return true;

    }


}
