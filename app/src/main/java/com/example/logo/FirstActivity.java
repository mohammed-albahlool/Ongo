package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FirstActivity extends AppCompatActivity {

    ImageButton imagvi3 ;
    ImageView imagvi1 , imagvi2   ;
    TextView texvi1 , texvi2 , texvi3  ;
    CircleImageView circleImageView ;
    RecyclerView recyclerView ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        imagvi1 = findViewById(R.id.sahem);
        imagvi2 = findViewById(R.id.search);
        texvi1 = findViewById(R.id.edit);
        circleImageView = findViewById(R.id.circleImageView);
        texvi2 = findViewById(R.id.name);
        texvi3 = findViewById(R.id.email);
        imagvi3 = findViewById(R.id.imageEdit);
        recyclerView = findViewById(R.id.recyclerview);

        ArrayList<Person> persons = new ArrayList<>();
        
        PersonAdapter personAdapter = new PersonAdapter(persons , FirstActivity.this);
        recyclerView.setAdapter(personAdapter);




    }
}