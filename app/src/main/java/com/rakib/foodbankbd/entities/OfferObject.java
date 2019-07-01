package com.rakib.foodbankbd.entities;

import androidx.annotation.NonNull;

public class OfferObject {
    private String offerName;
    private int offerImage;
    private String offerDescription;
    private double offerPrice;
    private String offerDuration;
    private String offerLocation;
    private String offerItem;

    public OfferObject(String offerName,
                       int offerImage,
                       String offerDescription,
                       double offerPrice,
                       String offerDuration,
                       String offerLocation,
                       String offerItem) {
        this.offerName = offerName;
        this.offerImage = offerImage;
        this.offerDescription = offerDescription;
        this.offerPrice = offerPrice;
        this.offerDuration = offerDuration;
        this.offerLocation = offerLocation;
        this.offerItem = offerItem;
    }

    public String getOfferName() { return offerName; }
    public int getOfferImage() { return offerImage; }
    public String getOfferDescription() { return offerDescription; }
    public double getOfferPrice() { return offerPrice; }
    public String getOfferDuration() { return offerDuration; }
    public String getOfferLocation() { return offerLocation; }
    public String getOfferItem() { return offerItem; }

    @NonNull
    @Override
    public String toString() {
        return "Offer Name: " + offerName;
    }
}
