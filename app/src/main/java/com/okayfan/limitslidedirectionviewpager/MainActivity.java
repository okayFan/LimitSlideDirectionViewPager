package com.okayfan.limitslidedirectionviewpager;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private MyPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final LimitSlideDirectionViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAllowedSwipeDirection(SwipeDirection.NONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setAllowedSwipeDirection(SwipeDirection.ALL);

            }
        });
        //填充数据
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB());
        adapter = new MyPagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
    }


}
