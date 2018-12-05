package com.hp.enums;

public enum GenderEnum {

    MALE(1, "男"),
    FEMALE(2, "女");

    GenderEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
