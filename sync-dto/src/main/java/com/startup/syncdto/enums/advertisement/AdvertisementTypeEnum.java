package com.startup.syncdto.enums.advertisement;

import java.util.List;

import static com.startup.syncdto.enums.advertisement.RentCategoryEnum.*;
import static com.startup.syncdto.enums.advertisement.SellCategoryEnum.*;

public enum AdvertisementTypeEnum {

    SELL("SELL"),
    RENT("RENT");

    private final String description;
    private final List<RentCategoryEnum> rentCategory = List.of(RENT_FLAT, RENT_ROOM, RENT_HOUSE, RENT_GROWN);
    private final List<SellCategoryEnum> sellCategory = List.of(SELL_FLAT, SELL_ROOM, SELL_HOUSE, SELL_GROWN);



    AdvertisementTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public List<RentCategoryEnum> getRentCategory() {
        return this.rentCategory;
    }

    public List<SellCategoryEnum> getSellCategory() {
        return this.sellCategory;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
