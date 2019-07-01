package com.rakib.foodbankbd.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rakib.foodbankbd.OfferActivity;
import com.rakib.foodbankbd.R;
import com.rakib.foodbankbd.entities.OfferObject;

import java.util.List;

public class OfferRecyclerViewAdapter extends RecyclerView.Adapter<OfferRecyclerViewHolder> {
    private Context context;
    private List<OfferObject> allOffers;

    public  OfferRecyclerViewAdapter(Context context, List<OfferObject> allOffers) {
        this.context = context;
        this.allOffers = allOffers;
    }

    @NonNull
    @Override
    public OfferRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_area, parent, false);
        OfferRecyclerViewHolder offerHolder = new OfferRecyclerViewHolder(layoutView);
        return offerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OfferRecyclerViewHolder holder, final int position) {
        final OfferObject singleOffer = allOffers.get(position);

        holder.offerName.setText(singleOffer.getOfferName());
        holder.offerImage.setImageResource(singleOffer.getOfferImage());

        holder.offerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offerIntent = new Intent(context, OfferActivity.class);

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();

                String stringObjectRepresentation = gson.toJson(singleOffer);

                offerIntent.putExtra("OFFER_CODE", stringObjectRepresentation);
                context.startActivity(offerIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allOffers.size();
    }
}
