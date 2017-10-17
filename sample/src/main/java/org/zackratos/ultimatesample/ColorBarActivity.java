package org.zackratos.ultimatesample;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.zackratos.ultimatebar.UltimateBar;


public class ColorBarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        UltimateBar ultimateBar = new UltimateBar(this);
//        @ColorInt int color = ContextCompat.getColor(this, R.color.SpringGreen);
        ultimateBar.setColorBar(ContextCompat.getColor(this, R.color.SpringGreen),
                50, ContextCompat.getColor(this, R.color.DoderBlue), 50);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.SpringGreen));



    }

/*    @Override
    protected void initBar() {
        setColorBar(ContextCompat.getColor(this, R.color.SpringGreen), 50);
    }*/


}
