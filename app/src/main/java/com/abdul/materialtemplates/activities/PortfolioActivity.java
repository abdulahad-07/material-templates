package com.abdul.materialtemplates.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.abdul.materialtemplates.R;
import com.abdul.materialtemplates.adapters.PortfolioAdapter;
import com.abdul.materialtemplates.interfaces.CustomOnClickInterface;
import com.abdul.materialtemplates.models.PortfolioModel;
import com.abdul.materialtemplates.themes.D1P1Activity;

import java.util.ArrayList;

public class PortfolioActivity extends AppCompatActivity implements CustomOnClickInterface {
    
    ArrayList<PortfolioModel> portfolioList = new ArrayList<>();
    PortfolioAdapter portfolioAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        
        RecyclerView rv_portfolio = findViewById(R.id.rv_portfolio);
        rv_portfolio.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        portfolioAdapter = new PortfolioAdapter(portfolioList, this);
        rv_portfolio.setAdapter(portfolioAdapter);
        
        setPortfolio();
    }
    
    private void setPortfolio() {
        portfolioList.clear();
        portfolioList.add(new PortfolioModel("D1P1", "e commerce", R.drawable.taras_migulko_1));
        portfolioList.add(new PortfolioModel("D1P2", "body scanner", R.drawable.taras_migulko_2));
        portfolioList.add(new PortfolioModel("D1P3", "sports", R.drawable.taras_migulko_3));
        portfolioAdapter.notifyDataSetChanged();
    }
    
    @Override
    public void onClick(String attribute) {
        if(attribute.equals("D1P1")) {
            startActivity(new Intent(PortfolioActivity.this, D1P1Activity.class));
        }
    }
}
