package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

    String[] iceCreamFlavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    Map<String, int[]> flavourCode  = new HashMap<>();

    //TODO: Is there a better way to associate ice cream flavours with flavour code.

    public Exercise003(){
        int i = 0;
        for (String iceCreamFlavour:iceCreamFlavours) {
            flavourCode.put(iceCreamFlavour,new int[]{i++});
        }
    }

    int getIceCreamCode(String iceCreamFlavour) {
       return flavourCode.get(iceCreamFlavour)[0];
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
