package com.example.abe.tipicpam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener {
    Button aboutusbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        aboutusbutton = (Button) findViewById(R.id.aboutusbutton);
        aboutusbutton.setOnClickListener(this);

        configureImageButton1();
        configureImageButton2();
        configureImageButton3();
        configureImageButton4();
    }


    private void configureImageButton2(){
        ImageView btn1 = (ImageView) findViewById(R.id.iView2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PhotosActivity.class);
                Toast.makeText(SecondActivity.this, "Wait a while to see some popular photos on I.G", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }

        });

    }

    private void configureImageButton1(){
        ImageView btn2 = (ImageView) findViewById(R.id.iView1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(getApplicationContext(), SearchActivity.class);
                Toast.makeText(SecondActivity.this, " Make any search", Toast.LENGTH_SHORT).show();

                startActivity(intent1);

            }

        });

    }
    private void configureImageButton3(){
        ImageView btn3 = (ImageView) findViewById(R.id.iView3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*/ Create a Uri from an intent string. Use the result to create an Intent.
Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
startActivity(mapIntent);*/
                /*Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                 LatLng Haiti = new LatLng(18.5392, -72.3364);
                */


                Uri gmiUrL = Uri.parse("geo:<lat>,<long>?q=<lat>,<long>(Label+Name)");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmiUrL);
                Toast.makeText(SecondActivity.this, " Map is Loading", Toast.LENGTH_SHORT).show();

                startActivity(mapIntent);
            }

        });

    }


    private void configureImageButton4(){
        ImageView btn4 = (ImageView) findViewById(R.id.iView4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u=Uri.parse("facebook://facebook.com/photo");

                Intent intent4 = new Intent(Intent.ACTION_VIEW,u);
                Toast.makeText(SecondActivity.this, "Lets see some pic on facebook", Toast.LENGTH_SHORT).show();

                startActivity(intent4);
            }

        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), AboutUsActivity.class);

        startActivity(intent);
    }




}

