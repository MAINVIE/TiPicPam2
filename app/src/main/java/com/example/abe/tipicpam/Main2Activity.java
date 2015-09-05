package com.example.abe.tipicpam;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {
    GridView gv;


    public static String [] PlajList={"Akaba Bay"
            ,"Anse a Raisin"
            ,"Anse D'Azur"
            ,"Club Indigo"
            ,"Plage Cornier"
            ,"La Trompeuse"
            ,"Labadie"
            ,"Moulin sur Mer"
            ,"La pointe Ouest"
            ,"Plage de Port Morgan"};
    public static int [] plist={R.drawable.akaba_bay
            ,R.drawable.ansaraisin
            ,R.drawable.anse_dazur
            ,R.drawable.club_indigo
            ,R.drawable.cornier_plage
            ,R.drawable.la_trompeuse
            ,R.drawable.labadie
            ,R.drawable.moulin_sur_mer
            ,R.drawable.point_ouest
            ,R.drawable.port_morgan};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new PlajAdapter(this, PlajList, plist));
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }

