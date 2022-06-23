package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondAcitivty extends AppCompatActivity {

    ImageView imageVie ;
    TextView textVie1 , textVie2 , textVie3 , textVie4  , textVie5 , textVie6 ;
    EditText editText1 , editText2 , editText3 , editText4 , editText5 ;
    Button button ;
    private WorkViewModel workViewModel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageVie = findViewById(R.id.sahem2);
        textVie1 = findViewById(R.id.edit);
        textVie2 = findViewById(R.id.texv1);
        textVie3 = findViewById(R.id.texv2);
        textVie4 = findViewById(R.id.texv3);
        textVie5 = findViewById(R.id.texv4);
        textVie6 = findViewById(R.id.texv5);
        editText1 = findViewById(R.id.edit1);
        editText2 = findViewById(R.id.edit2);
        editText3 = findViewById(R.id.edit3);
        editText4 = findViewById(R.id.edit4);
        editText5 = findViewById(R.id.edit5);
        button = findViewById(R.id.butt);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }
}