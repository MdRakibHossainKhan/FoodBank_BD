package com.rakib.foodbankbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.rakib.foodbankbd.adapters.AreaRecyclerViewAdapter;
import com.rakib.foodbankbd.adapters.OfferRecyclerViewAdapter;
import com.rakib.foodbankbd.entities.AreaObject;
import com.rakib.foodbankbd.entities.OfferObject;
import com.rakib.foodbankbd.helpers.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class OffersActivity extends AppCompatActivity {
    TextView offersTitle;

    int areaCode;
    private RecyclerView offerRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        offersTitle = findViewById(R.id.textViewOffersTitle);

        areaCode = getIntent().getExtras().getInt("AREA_CODE");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        offerRecyclerView = findViewById(R.id.recyclerViewOffer);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(OffersActivity.this, 2);
        offerRecyclerView.setLayoutManager(gridLayoutManager);
        offerRecyclerView.setHasFixedSize(true);
        offerRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 24, true));
        areaWiseOfferShower();
    }

    private void areaWiseOfferShower() {
        if (areaCode == 0) {
            offerRecyclerView.setAdapter(new OfferRecyclerViewAdapter(OffersActivity.this, getAllOffersFromShyamoli()));
            offersTitle.setText("Offers in Shyamoli");
        }

        else if (areaCode == 1) {
            offerRecyclerView.setAdapter(new OfferRecyclerViewAdapter(OffersActivity.this, getAllOffersFromDhanmondi()));
            offersTitle.setText("Offers in Dhanmondi");
        }

        else if (areaCode == 2) {
            offerRecyclerView.setAdapter(new OfferRecyclerViewAdapter(OffersActivity.this, getAllOffersFromBanani()));
            offersTitle.setText("Offers in Banani");
        }

        else if (areaCode == 3) {
            offerRecyclerView.setAdapter(new OfferRecyclerViewAdapter(OffersActivity.this, getAllOffersFromMirpur()));
            offersTitle.setText("Offers in Mirpur");
        }

        else if (areaCode == 4) {
            offerRecyclerView.setAdapter(new OfferRecyclerViewAdapter(OffersActivity.this, getAllOffersFromWari()));
            offersTitle.setText("Offers in Wari");
        }
    }

    private List<OfferObject> getAllOffersFromShyamoli() {
        List<OfferObject> offers = new ArrayList<OfferObject>();
        offers.add(new OfferObject(
                "Couple Offer",
                R.drawable.best_couple_offer_hakka_square_shyamoli,
                "For two person. Price is inclusive VAT. Food tastes ok.",
                349.0,
                "Undefined",
                "Hakka Square (Shyamoli Square)",
                "* Set Menu\n* Cold Drinks"));
        return offers;
    }

    private List<OfferObject> getAllOffersFromDhanmondi() {
        List<OfferObject> offers = new ArrayList<OfferObject>();
        offers.add(new OfferObject(
                "Matha Noshto Offer",
                R.drawable.matha_noshto_offer_the_bitcoin_cafe_panthapath,
                "Price is inclusive VAT. Food is delicious but service is so so. You can try this with your friends and family.",
                220.0,
                "Undefined",
                "The Bitcoin Cafe (Panthapath)",
                "* Tower Nachos\n* 4 Piece BBQ Wings"));

        offers.add(new OfferObject(
                "Black Bun Charcoal Burger (Mini)",
                R.drawable.black_bun_charcoal_burger_mini_burger_queen_dhanmondi,
                "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                95.0,
                "Undefined",
                "Burger Queen (Dhanmondi)",
                "* Black Bun Charcoal Burger (Mini)"));

        offers.add(new OfferObject(
                "Ramen",
                R.drawable.ramen_cheese_lab_panthapath,
                "Food is good. You can try this with your friends and family.",
                250.0,
                "Undefined",
                "Cheese Lab (Panthapath)",
                "* Ramen"));

        offers.add(new OfferObject(
                "Chicken Cheese Burger",
                R.drawable.chicken_cheese_burger_melt_town_dhanmondi,
                "Food is delicious. Try this with your friends and family.",
                99.0,
                "Undefined",
                "Melt Town (Dhanmondi)",
                "* Chicken Cheese Burger"));

        offers.add(new OfferObject(
                "Pasta",
                R.drawable.pasta_melt_town_dhanmondi,
                "Food is delicious. Try this with your friends and family.",
                99.0,
                "Undefined",
                "Melt Town (Dhanmondi)",
                "* Pasta"));
        return offers;
    }

    private List<OfferObject> getAllOffersFromBanani() {
        List<OfferObject> offers = new ArrayList<OfferObject>();
        offers.add(new OfferObject(
                "Ultimate Chocolate Cake",
                R.drawable.ultimate_chocolate_cake_tabaq_coffee_gulshan,
                "Price is inclusive VAT. Very delicious dessert. You must try this with your friends and family.",
                380.0,
                "Undefined",
                "Tabaq Coffee (Gulshan)",
                "* Chocolate Cake"));
        return offers;
    }

    private List<OfferObject> getAllOffersFromMirpur() {
        List<OfferObject> offers = new ArrayList<OfferObject>();
        offers.add(new OfferObject(
                "BBQ Feast",
                R.drawable.bbq_feast_peri_pasta_mirpur,
                "Very delicious food. Try this with your friends and family.",
                205.0,
                "Undefined",
                "Peri Pasta (Mirpur)",
                "* Fried Rice\n* 2 Piece Chicken Drum\n* Chinese Vegetable\n* Garnish Salad"));

        offers.add(new OfferObject(
                "Naga Wave Pasta",
                R.drawable.naga_wave_pasta_cheese_factory_mirpur,
                "Very delicious pasta. Try this with your friends and family. Price is inclusive VAT.",
                225.0,
                "Undefined",
                "Cheese Lab (Mirpur)",
                "* Naga Pasta"));

        offers.add(new OfferObject(
                "Cheese and BBQ Chicken Pizza",
                R.drawable.cheese_and_bbq_chicken_pizza_cheese_factory_mirpur,
                "Very delicious pizza. Try this with your friends and family. Price is inclusive VAT.",
                395.0,
                "Undefined",
                "Cheese Lab (Mirpur)",
                "* Large Pizza"));

        offers.add(new OfferObject(
                "Mango Milkshake",
                R.drawable.mango_milkshake_burger_queen_mirpur,
                "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                70.0,
                "Undefined",
                "Burger Queen (Mirpur)",
                "* Mango Milkshake"));

        offers.add(new OfferObject(
                "Vengaboys Burger Mini",
                R.drawable.vengaboys_burger_mini_burger_queen_mirpur,
                "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                70.0,
                "Undefined",
                "Burger Queen (Mirpur)",
                "* Mini Burger"));
        return offers;
    }

    private List<OfferObject> getAllOffersFromWari() {
        List<OfferObject> offers = new ArrayList<OfferObject>();
        offers.add(new OfferObject(
                "SP: 02",
                R.drawable.sp_02_grand_haveli_wari,
                "Very delicious food. You must try this with your friends and family. Decoration is nice.",
                250.0,
                "Undefined",
                "Grand Haveli (Wari)",
                "* Set Menu"));
        return offers;
    }
}
