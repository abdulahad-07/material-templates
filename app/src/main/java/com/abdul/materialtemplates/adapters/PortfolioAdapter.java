package com.abdul.materialtemplates.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abdul.materialtemplates.databinding.RowPortfolioBinding;
import com.abdul.materialtemplates.interfaces.CustomOnClickInterface;
import com.abdul.materialtemplates.models.PortfolioModel;

import java.util.ArrayList;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.MyViewHolder> {
    
    private ArrayList<PortfolioModel> portfolioList;
    private CustomOnClickInterface iCustomClick;
    
    public PortfolioAdapter(ArrayList<PortfolioModel> portfolioList, CustomOnClickInterface iCustomClick) {
        this.portfolioList = portfolioList;
        this.iCustomClick = iCustomClick;
    }
    
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RowPortfolioBinding mBinding = RowPortfolioBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(mBinding);
    }
    
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(portfolioList.get(position));
    }
    
    @Override
    public int getItemCount() {
        return portfolioList.size();
    }
    
    class MyViewHolder extends RecyclerView.ViewHolder {
        
        private final RowPortfolioBinding binding;
        
        MyViewHolder(RowPortfolioBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        
        void bind(PortfolioModel portfolioModel) {
            binding.setData(portfolioModel);
            binding.setICustomClick(iCustomClick);
            binding.executePendingBindings();
        }
    }
}
