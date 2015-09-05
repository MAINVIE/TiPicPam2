package com.example.abe.tipicpam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class Main3Activity extends AppCompatActivity {
    GridView gv;


    public static String [] sitList={"Grotte de Miragoane "
            ,"Palais National"
            ,"Cascade Tuyac"
            ,"Cathedrale de Port_au_Prince"
            ,"Citadelle Laferriere"
            ,"Monuments de  Vertieres"
            ,"Palais Sans Souci "
            ,"Saut D'eau"
            ,"Saut Mathurine"
            ,"Bassin Bleue"};
    public static int [] slist={R.drawable.grotte_miragoane
            ,R.drawable.palais_national
            ,R.drawable.cascad_tuyak
            ,R.drawable.cathedrale_port_au_prince
            ,R.drawable.citadelle
            ,R.drawable.monuments_vertieres
            ,R.drawable.palais_sans_souci
            ,R.drawable.sodo
            ,R.drawable.saut_mathurine
            ,R.drawable.bassin_ble};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        gv=(GridView) findViewById(R.id.gridView3);
        gv.setAdapter(new SitAdapter(this, sitList, slist));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main3, menu);
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
