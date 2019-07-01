package com.rakib.foodbankbd.entities;

public class AreaObject {
    private String areaName;
    private int areaImage;

    public AreaObject(String areaName, int areaImage) {
        this.areaName = areaName;
        this.areaImage = areaImage;
    }

    public String getAreaName() { return areaName; }
    public int getAreaImage() { return areaImage; }

    @Override
    public String toString() { return "Area Name: " + areaName; }
}
