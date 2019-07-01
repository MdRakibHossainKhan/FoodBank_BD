package com.rakib.foodbankbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.rakib.foodbankbd.adapters.AreaRecyclerViewAdapter;
import com.rakib.foodbankbd.entities.AreaObject;
import com.rakib.foodbankbd.helpers.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView areaRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        areaRecyclerView = findViewById(R.id.recyclerViewArea);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        areaRecyclerView.setLayoutManager(gridLayoutManager);
        areaRecyclerView.setHasFixedSize(true);
        areaRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 24, true));
        AreaRecyclerViewAdapter areaRecyclerViewAdapter = new AreaRecyclerViewAdapter(MainActivity.this, getAllArea());
        areaRecyclerView.setAdapter(areaRecyclerViewAdapter);
    }

    private List<AreaObject> getAllArea() {
        List<AreaObject> areas = new ArrayList<AreaObject>();
        areas.add(new AreaObject("Shyamoli", R.drawable.shyamoli));
        areas.add(new AreaObject("Dhanmondi", R.drawable.dhanmondi));
        areas.add(new AreaObject("Banani", R.drawable.banani));
        areas.add(new AreaObject("Mirpur", R.drawable.mirpur));
        areas.add(new AreaObject("Wari", R.drawable.wari));
        return areas;
    }
}
