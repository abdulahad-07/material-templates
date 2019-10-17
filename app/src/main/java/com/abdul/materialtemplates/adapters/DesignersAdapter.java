package com.abdul.materialtemplates.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abdul.materialtemplates.models.DesignersModel;
import com.abdul.materialtemplates.databinding.RowDesignerBinding;
import com.abdul.materialtemplates.interfaces.CustomOnClickInterface;

import java.util.ArrayList;

public class DesignersAdapter extends RecyclerView.Adapter<DesignersAdapter.MyViewHolder> implements Filterable {
    
    private ArrayList<DesignersModel> designersList;
    private ArrayList<DesignersModel> designersListFiltered;
    private CustomOnClickInterface iCustomClick;
    
    public DesignersAdapter(ArrayList<DesignersModel> designersList, CustomOnClickInterface iCustomClick) {
        this.designersList = designersList;
        designersListFiltered = designersList;
        this.iCustomClick = iCustomClick;
    }
    
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RowDesignerBinding mBinding = RowDesignerBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(mBinding);
    }
    
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(designersListFiltered.get(position));
    }
    
    @Override
    public int getItemCount() {
        return designersListFiltered.size();
    }
    
    @Override
    public Filter getFilter() {
        return null;
    }
    
    class MyViewHolder extends RecyclerView.ViewHolder {
        
        private final RowDesignerBinding binding;
        
        MyViewHolder(RowDesignerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        
        void bind(DesignersModel designersModel) {
            binding.setICustomClick(iCustomClick);
            binding.setData(designersModel);
            binding.executePendingBindings();
        }
    }
}
