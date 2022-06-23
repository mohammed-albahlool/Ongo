package com.example.logo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Fragment_Splash3 extends Fragment {

    View view ;
    ImageView imageView9 , imageView10 , imageView11 ,imageView12 ,imageView13;
    TextView textview7 , textview8 , textview9 ;
    Button button1 ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        view = inflater.inflate(R.layout.fragment_splash3, container, false);
        return view ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView9 = view.findViewById(R.id.imageView9);
        imageView10 = view.findViewById(R.id.imageView10);
        imageView11 = view.findViewById(R.id.imageView11);
        imageView12 = view.findViewById(R.id.imageView12);
        imageView13 = view.findViewById(R.id.imageView13);
        textview7 = view.findViewById(R.id.textview7);
        textview8 = view.findViewById(R.id.textview8);
        textview9 = view.findViewById(R.id.textview9);
        button1 = view.findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                
            }
        });

    }


}