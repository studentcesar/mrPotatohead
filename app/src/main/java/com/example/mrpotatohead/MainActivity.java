package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms;
    ImageView body;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView moustache;
    ImageView mouth;
    ImageView nose;
    ImageView shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = findViewById(R.id.imgarms);
        body = findViewById(R.id.imgbody);
        ears = findViewById(R.id.imgears);
        eyebrows = findViewById(R.id.imgeyebrows);
        eyes = findViewById(R.id.imgeyes);
        glasses = findViewById(R.id.imgglasses);
        hat = findViewById(R.id.imghat);
        mouth = findViewById(R.id.imgmouth);
        moustache = findViewById(R.id.imgmoustache);
        nose = findViewById(R.id.imgnose);
        shoes = findViewById(R.id.imgshoes);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("arms",arms.getVisibility());
        outState.putInt("body",body.getVisibility());
        outState.putInt("ears",ears.getVisibility());
        outState.putInt("eyebrows",eyebrows.getVisibility());
        outState.putInt("eyes",eyes.getVisibility());
        outState.putInt("glasses",glasses.getVisibility());
        outState.putInt("hat",hat.getVisibility());
        outState.putInt("moustache",moustache.getVisibility());
        outState.putInt("mouth",mouth.getVisibility());
        outState.putInt("nose",nose.getVisibility());
        outState.putInt("shoes",shoes.getVisibility());


    }

    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);

        arms.setVisibility(inState.getInt("arms"));
        body.setVisibility(inState.getInt("body"));
        ears.setVisibility(inState.getInt("ears"));
        eyebrows.setVisibility(inState.getInt("eyebrows"));
        eyes.setVisibility(inState.getInt("eyes"));
        glasses.setVisibility(inState.getInt("glasses"));
        hat.setVisibility(inState.getInt("hat"));
        moustache.setVisibility(inState.getInt("moustache"));
        mouth.setVisibility(inState.getInt("mouth"));
        nose.setVisibility(inState.getInt("nose"));
        shoes.setVisibility(inState.getInt("shoes"));


    }




    public void checkClicked(View v) {
        Log.d("potato","checkClicked:");

        CheckBox checkbox = (CheckBox) v;

        boolean checked = checkbox.isChecked();

        switch(v.getId()){
            case(R.id.arms):
                ImageView arms = (ImageView) findViewById(R.id.imgarms);
                if(checked){
                    arms.setVisibility(v.VISIBLE);
                }
                else{
                    arms.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.ears):
                ImageView ears = (ImageView) findViewById(R.id.imgears);
                if(checked){
                    ears.setVisibility(v.VISIBLE);
                }
                else{
                    ears.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.eyebrows):
                ImageView eyebrows = (ImageView) findViewById(R.id.imgeyebrows);
                if(checked){
                    eyebrows.setVisibility(v.VISIBLE);
                }
                else{
                    eyebrows.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.eyes):
                ImageView eyes = (ImageView) findViewById(R.id.imgeyes);
                if(checked){
                    eyes.setVisibility(v.VISIBLE);
                }
                else{
                    eyes.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.glasses):
                ImageView glasses = (ImageView) findViewById(R.id.imgglasses);
                if(checked){
                    glasses.setVisibility(v.VISIBLE);
                }
                else{
                    glasses.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.hat):
                ImageView hat = (ImageView) findViewById(R.id.imghat);
                if(checked){
                    hat.setVisibility(v.VISIBLE);
                }
                else{
                    hat.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.mouth):
                ImageView mouth = (ImageView) findViewById(R.id.imgmouth);
                if(checked){
                    mouth.setVisibility(v.VISIBLE);
                }
                else{
                    mouth.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.moustache):
                ImageView moustache = (ImageView) findViewById(R.id.imgmoustache);
                if(checked){
                    moustache.setVisibility(v.VISIBLE);
                }
                else{
                    moustache.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.nose):
                ImageView nose = (ImageView) findViewById(R.id.imgnose);
                if(checked){
                    nose.setVisibility(v.VISIBLE);
                }
                else{
                    nose.setVisibility(v.INVISIBLE);
                }
                break;

            case(R.id.shoes):
                ImageView shoes = (ImageView) findViewById(R.id.imgshoes);
                if(checked){
                    shoes.setVisibility(v.VISIBLE);
                }
                else{
                    shoes.setVisibility(v.INVISIBLE);
                }
                break;
        }



    }


}
