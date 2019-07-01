package com.rakib.foodbankbd.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rakib.foodbankbd.OffersActivity;
import com.rakib.foodbankbd.R;
import com.rakib.foodbankbd.entities.AreaObject;

import java.util.List;

public class AreaRecyclerViewAdapter extends RecyclerView.Adapter<AreaRecyclerViewHolder> {
    private Context context;
    private List<AreaObject> allAreas;

    public  AreaRecyclerViewAdapter(Context context, List<AreaObject> allAreas) {
        this.context = context;
        this.allAreas = allAreas;
    }

    @NonNull
    @Override
    public AreaRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_area, parent, false);
        AreaRecyclerViewHolder areaHolder = new AreaRecyclerViewHolder(layoutView);
        return areaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AreaRecyclerViewHolder holder, final int position) {
        final AreaObject singleArea = allAreas.get(position);
        holder.areaName.setText(singleArea.getAreaName());
        holder.areaImage.setImageResource(singleArea.getAreaImage());

        holder.areaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent areaIntent = new Intent(context, OffersActivity.class);
                areaIntent.putExtra("AREA_CODE", position);
                context.startActivity(areaIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allAreas.size();
    }
}
