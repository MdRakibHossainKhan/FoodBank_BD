package com.rakib.foodbankbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rakib.foodbankbd.entities.OfferObject;

public class OfferActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView offerImage;
    private TextView offerName, offerLocation, offerPrice, offerDuration, offerItem, offerDescription;

    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        offerImage = findViewById(R.id.imageViewOfferImage);
        offerName = findViewById(R.id.textViewOfferName);
        offerLocation = findViewById(R.id.textViewOfferLocation);
        offerPrice = findViewById(R.id.textViewOfferPrice);
        offerDuration = findViewById(R.id.textViewOfferDuration);
        offerItem = findViewById(R.id.textViewOfferItem);
        offerDescription = findViewById(R.id.textViewOfferDescription);

        findViewById(R.id.buttonMap).setOnClickListener(this);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();

        String offerInStringFormat = getIntent().getExtras().getString("OFFER_CODE");
        final OfferObject singleOffer = gson.fromJson(offerInStringFormat, OfferObject.class);

        if (singleOffer != null) {
            offerImage.setImageResource(singleOffer.getOfferImage());
            offerName.append(singleOffer.getOfferName());
            offerLocation.append(singleOffer.getOfferLocation());
            offerPrice.append(Double.toString(singleOffer.getOfferPrice()));
            offerDuration.append(singleOffer.getOfferDuration());
            offerItem.append(singleOffer.getOfferItem());
            offerDescription.append(singleOffer.getOfferDescription());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonMap:
                Toast.makeText(OfferActivity.this, "This feature is coming soon!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
