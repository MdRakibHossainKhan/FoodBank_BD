package com.rakib.foodbankbd.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rakib.foodbankbd.R;

public class OfferRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView offerImage;
    public TextView offerName;

    public OfferRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        offerImage = itemView.findViewById(R.id.imageViewArea);
        offerName = itemView.findViewById(R.id.textViewArea);
    }
}
