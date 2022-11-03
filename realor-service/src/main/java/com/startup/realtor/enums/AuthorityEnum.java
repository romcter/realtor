package com.startup.realtor.enums;

public enum AuthorityEnum {

    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_RIELTOR("ROLE_RIELTOR");

    private final String name;

    AuthorityEnum(final String name) {
        this.name = name;
    }

}
