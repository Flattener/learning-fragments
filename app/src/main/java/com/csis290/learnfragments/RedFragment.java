package com.csis290.learnfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Charles Flaten on 3/4/2015.
 */
public class RedFragment extends Fragment {
    private TextView tvRed;
    private String message;

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getArguments().getString("key");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { // we return the inflater that was passed to us
        return inflater.inflate(R.layout.fragment_red, container, false); //R.laytout is what we need to remember
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvRed = (TextView) view.findViewById(R.id.red_fragment_declaration);
        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvRed.setText(message);
            }
        });
    }
}
