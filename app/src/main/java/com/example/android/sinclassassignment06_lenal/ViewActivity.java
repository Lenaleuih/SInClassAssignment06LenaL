package com.example.android.sinclassassignment06_lenal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewActivity extends AppCompatActivity {

    private TextView mAnimalInformation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        mAnimalInformation = (TextView)findViewById(R.id.animalInformation) ;

        Intent mIntent = getIntent();
        Animal a = (Animal) mIntent.getSerializableExtra(Keys.ANIMAL_KEY);
        mAnimalInformation.setText(a.toString());

    }
}
