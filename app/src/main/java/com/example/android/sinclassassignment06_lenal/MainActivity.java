package com.example.android.sinclassassignment06_lenal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText animalName;
    private EditText numberOfLegs;
    private CheckBox hasFur;
    private EditText otherInformation;

    private Button submitButton;
    private String animalClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalName = (EditText) findViewById(R.id.animalName);
        numberOfLegs = (EditText) findViewById(R.id.numberOfLegs);
        hasFur = (CheckBox) findViewById(R.id.hasFur);
        otherInformation = (EditText) findViewById(R.id.moreInformation);
        submitButton = (Button) findViewById(R.id.submitButton);

    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.type1:
                if (checked)
                    animalClass = "mammal";
                break;
            case R.id.type2:
                if (checked)
                    animalClass = "bird";
                break;
            case R.id.type3:
                if (checked)
                    animalClass = "fish";
                break;
            case R.id.type4:
                if (checked)
                    animalClass = "reptile";
                break;
            case R.id.otherType:
                if (checked)
                    animalClass = "other classes";
                break;
        }

    }

    public void submit(View view) {
        String n = animalName.getText().toString();
        int l = Integer.parseInt(numberOfLegs.getText().toString());
        Boolean f = hasFur.isChecked();
        String oi = otherInformation.getText().toString();

        Intent intent = new Intent(this, ViewActivity.class);
        Animal a = new Animal(n, l, f, animalClass, oi);
        intent.putExtra(Keys.ANIMAL_KEY, a);

        startActivity(intent);

    }
}
