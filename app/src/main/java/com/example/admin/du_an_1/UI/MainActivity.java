package com.example.admin.du_an_1.UI;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.du_an_1.Adapter.TabAdapter;
import com.example.admin.du_an_1.R;
import com.example.admin.du_an_1.UI.Fragment.Fragment_List;
import com.example.admin.du_an_1.UI.Fragment.Fragment_Statitic;
import com.example.admin.du_an_1.UI.Fragment.Fragment_User;

public class MainActivity extends AppCompatActivity {
    private TabAdapter tabAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        tabAdapter= new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new Fragment_List(), "Storage");
        tabAdapter.addFragment(new Fragment_User(), "Users");
        tabAdapter.addFragment(new Fragment_Statitic(), "Statistics");
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
