package com.abdul.materialtemplates.viewbinder;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.abdul.materialtemplates.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class GlideBindingAdapters {
    
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, int imageUri) {
        
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.profile_pic)
                .error(R.drawable.profile_pic);
        
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUri)
                .into(view);
    }
    
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, String imageUri) {
        
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.profile_pic)
                .error(R.drawable.profile_pic);
        
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUri)
                .into(view);
    }
}
