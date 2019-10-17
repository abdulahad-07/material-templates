package com.abdul.materialtemplates.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdul.materialtemplates.R;
import com.abdul.materialtemplates.adapters.DesignersAdapter;
import com.abdul.materialtemplates.interfaces.CustomOnClickInterface;
import com.abdul.materialtemplates.models.DesignersModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CustomOnClickInterface {
    
    ArrayList<DesignersModel> designersList = new ArrayList<>();
    DesignersAdapter designersAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RecyclerView rv_designersList = findViewById(R.id.rv_designersList);
        LinearLayoutManager llm = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rv_designersList.setLayoutManager(llm);
        designersAdapter = new DesignersAdapter(designersList, this);
        rv_designersList.setAdapter(designersAdapter);
        
        setDesigners();
    }
    
    private void setDesigners() {
        designersList.clear();
        designersList.add(new DesignersModel("Taras Migulko", 1, R.drawable.taras_migulko, "Prague, Czech Republic"));
        designersAdapter.notifyDataSetChanged();
    }
    
    @Override
    public void onClick(String attribute) {
        startActivity(new Intent(MainActivity.this, PortfolioActivity.class));
    }
}
