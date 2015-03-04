package com.csis290.learnfragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView tvGreen;
    private TextView tvBlue;
    private TextView tvRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGreen = (TextView) findViewById(R.id.tv_green);
        tvBlue = (TextView) findViewById(R.id.tv_blue);
        tvRed = (TextView) findViewById(R.id.tv_red);

        tvGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("key","Welcome to the Activity");

                GreenFragment greenFragment = new GreenFragment();
                greenFragment.setArguments(bundle1);


                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, greenFragment)
                        .addToBackStack("")
                        .commit();
            }
        });

        tvBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("key","Welcome to the Activity");

                BlueFragment blueFragment = new BlueFragment();
                blueFragment.setArguments(bundle2);
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, blueFragment)
                        .addToBackStack("")
                        .commit();

            }
        });

        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("key","Welcome to the Activity");

                RedFragment redFragment = new RedFragment();
                redFragment.setArguments(bundle3);
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, redFragment)
                        .addToBackStack("")
                        .commit();

            }
        });
    }
}
