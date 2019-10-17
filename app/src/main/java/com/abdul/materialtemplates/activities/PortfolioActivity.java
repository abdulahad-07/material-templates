package com.abdul.materialtemplates.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.abdul.materialtemplates.R;
import com.abdul.materialtemplates.adapters.PortfolioAdapter;
import com.abdul.materialtemplates.interfaces.CustomOnClickInterface;
import com.abdul.materialtemplates.models.PortfolioModel;

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
        portfolioList.add(new PortfolioModel("11", "e commerce", R.drawable.taras_migulko_1));
        portfolioList.add(new PortfolioModel("12", "body scanner", R.drawable.taras_migulko_2));
        portfolioList.add(new PortfolioModel("13", "sports", R.drawable.taras_migulko_3));
        portfolioAdapter.notifyDataSetChanged();
    }
    
    @Override
    public void onClick(String attribute) {
        Toast.makeText(this, attribute, Toast.LENGTH_SHORT).show();
    }
}
