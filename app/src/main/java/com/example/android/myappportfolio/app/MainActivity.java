package com.example.android.myappportfolio.app;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // For display Tost message
    String mtostText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void launchApp(View v) {
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer:
                mtostText=" This button Will launch Spotify Streamer App! ";
                displayToast();
                break;
            case R.id.btnScoresApp:
                mtostText=" This button Will launch  Score App! ";
                displayToast();
                break;
            case R.id.btnLibraryApp:
                mtostText="This button Will launch Library  App! ";
                displayToast();
                break;
            case R.id.btnBuildItBigger:
                mtostText=" This button Will launch  Build it bigger! ";
                displayToast();
                break;
            case R.id.btnXyzReader:
                mtostText=" This button Will launch  XYZ reader App! ";
                displayToast();
                break;
            case R.id.btncapstons:
                mtostText=" This button Will launch  Capstone App! ";
                displayToast();
                break;

        }
    }
    //  This is the method  for click on spotify streamer
   // public void openSpotifyStreamer(View v) {
//mtostText=" This button Will launch Spotify Streamer App ";
   //     displayToast();
  //  }

    // This is the method for  click on Score App
 //   public void openScoreApp(View v) {
   //     mtostText=" This button Will launch Open Score App ";
     //   displayToast();
    //}

    // This is the method for  click on Library App
  //  public void openLibraryApp(View v) {
    //    mtostText=" This button Will launch Library  App ";
      //  displayToast();
    //}
    // This is the method for  click on build App
    //public void openbuildItbigger(View v) {
      //  mtostText=" This button Will launch Build it bigger  App ";
        //displayToast();
    //}

    // This is the method for  click on xyz reader App
   // public void openXyzReader(View v) {
     //   mtostText=" This button Will launch Build it XYZ Reader  App ";
       // displayToast();
    //}
    // This is the method for  click on capston App
    //public void openCapstone(View v) {
      //  mtostText=" This button Will launch my Capstone  App ";
        //displayToast();

    //}

//
    //This is a method for disply tost
    public void displayToast(){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, mtostText, duration);
        toast.show();
    }


}
