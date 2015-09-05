package com.example.abe.tipicpam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import java.lang.Override;
import java.lang.String;

public class MainActivity0 extends AppCompatActivity {
    GridView gv;


    public static String[] FanmList = {"Anedie azael"
            , "Carla Leona"
            , "Eud"
            , "Gessica geneus"
            , "Maria sophia"
            , "Mikaelle Cartight"
            , "Miss Vee"
            , "Niska Garout"
            , "Sarodg Bertin"
    };
    public static int[] flist = {R.drawable.anedie_azael
            , R.drawable.carla_leona
            , R.drawable.eud
            , R.drawable.gessica_geneus
            , R.drawable.maria_sophia_bau
            , R.drawable.mikaelle_cartight
            , R.drawable.miss_vee
            , R.drawable.niska_garout
            , R.drawable.sarodg_bertin
            , R.drawable.shassy

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new GirlAdapter(this, FanmList, flist));


}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main0, menu);
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
