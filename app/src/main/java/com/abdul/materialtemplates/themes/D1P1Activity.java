package com.abdul.materialtemplates.themes;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.abdul.materialtemplates.R;

public class D1P1Activity extends AppCompatActivity {
    
    private DrawerLayout mDrawerLayout;
    RelativeLayout rl_menu;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d1_p1_activity);
        
        mDrawerLayout = findViewById(R.id.d1_p1_activity);
        rl_menu = findViewById(R.id.rl_menu);
        rl_menu.setOnClickListener(view -> {
            mDrawerLayout.openDrawer(Gravity.LEFT);
        });
        
        getSupportActionBar().hide();
    }
}
