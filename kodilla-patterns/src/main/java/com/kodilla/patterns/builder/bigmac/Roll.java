package com.kodilla.patterns.builder.bigmac;

public class Roll {
    public static final String W_SESAME = "WITH SESAME";
    public static final String WO_SESAME = "WITHOUT SESAME";
    private Roll roll;

    public void setRoll (Roll roll) {
        if (roll.equals(W_SESAME) || roll.equals(WO_SESAME)) {
            this.roll = roll;
        } else {
            throw new IllegalStateException("You can only choose roll with or without sesame.");
        }
    }

    public Roll getRoll() {
        return roll;
    }
}
