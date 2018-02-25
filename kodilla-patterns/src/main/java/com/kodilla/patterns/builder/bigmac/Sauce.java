package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND_ISLANDS = "THOUSAND ISLANDS";
    public static final String BBQ = "BBQ";
    private Sauce sauce;

    public void setSauce (Sauce sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLANDS) || sauce.equals(BBQ) || sauce.equals("")) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("You can choose Standard, BBQ, Thousand Islands sauce or no sauce.");
        }
    }

    public Sauce getSauce() {
        return sauce;
    }
}

