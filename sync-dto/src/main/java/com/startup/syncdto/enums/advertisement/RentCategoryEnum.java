package com.startup.syncdto.enums.advertisement;

public enum RentCategoryEnum {
    RENT_FLAT("RENT_FLAT"),
    RENT_ROOM("RENT_ROOM"),
    RENT_HOUSE("RENT_HOUSE"),
    RENT_GROWN("RENT_GROWN");

    private final String description;

    RentCategoryEnum(String description) {
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
