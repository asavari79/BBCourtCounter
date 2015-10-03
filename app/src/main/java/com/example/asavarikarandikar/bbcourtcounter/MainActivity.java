package com.example.asavarikarandikar.bbcourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0;
    int scoreB=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointTwoA(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void addPointTwoB(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }


    public void addPointThreeA(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    public void addPointThreeB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void addPointOneA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void addPointOneB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
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
