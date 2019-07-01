package com.rakib.foodbankbd.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rakib.foodbankbd.R;

public class AreaRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView areaImage;
    public TextView areaName;

    public AreaRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        areaImage = itemView.findViewById(R.id.imageViewArea);
        areaName = itemView.findViewById(R.id.textViewArea);
    }
}
