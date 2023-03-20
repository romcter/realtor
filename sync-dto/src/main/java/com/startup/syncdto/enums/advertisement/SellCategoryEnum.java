package com.startup.syncdto.enums.advertisement;

public enum SellCategoryEnum {
    SELL_FLAT("SELL_FLAT"),
    SELL_ROOM("SELL_ROOM"),
    SELL_HOUSE("SELL_HOUSE"),
    SELL_GROWN("SELL_GROWN");

    private final String description;

    SellCategoryEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
