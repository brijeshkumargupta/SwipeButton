package com.birjulabsinc.swipebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.birjulabsinc.swipebutton.databinding.ActivityMainBinding;
import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.btnCheckin.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                doTask();
            }
        });

    }

    private void doTask() {
        int i =10;
        if (i==9){
            Toast.makeText(getBaseContext(), "task done", Toast.LENGTH_SHORT).show();
        }else {
            activityMainBinding.btnCheckin.resetSlider();
            //here slide reset cause of i value is not equals to 9 its ten
        }

    }
}