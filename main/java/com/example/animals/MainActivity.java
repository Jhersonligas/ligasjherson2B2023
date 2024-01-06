package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    int [] pic = {R.drawable.animal_1,R.drawable.animal_2,R.drawable.animal_3,R.drawable.animal_4,R.drawable.animal_5,
            R.drawable.animal11,R.drawable.animal_7,R.drawable.animal_8,R.drawable.animal_9,R.drawable.animal_10};
    String[] animalsName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalsName=getResources().getStringArray(R.array.animal);
        gridView= (GridView)findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this,animalsName,pic);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                if(i==0){
                    Intent intent = new Intent(MainActivity.this,NewActivity.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(MainActivity.this,FourthActivity.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(MainActivity.this,FifthActivity.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(MainActivity.this,FoxActivity.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent = new Intent(MainActivity.this,GoatActivity.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent = new Intent(MainActivity.this,HorseActivity.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent = new Intent(MainActivity.this,IguanaActivity.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent = new Intent(MainActivity.this,JaguarActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}