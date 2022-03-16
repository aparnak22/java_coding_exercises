package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        String capitalizedWord = String.valueOf(Character.toUpperCase(word.charAt(0))) ;
        if (word.length() > 1 )
            capitalizedWord = capitalizedWord + word.substring(1);
        return capitalizedWord;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0) ;
    }

    /**
     * Calculate the price after adding VAT.
     * Limit the result to 2 decimal places.
     *
     * @param originalPrice The original price to which VAT is added
     * @param vatRate The rate of VAT to be applied
     * @return The price with VAT included
     */
    public double addVat(double originalPrice, double vatRate) {
        double priceWVat = originalPrice * (1 + vatRate /100.0);
        priceWVat =  Math.round(priceWVat * 100) / 100.0 ;
        return priceWVat;
    }

    public String reverse(String sentence) {
        StringBuilder strB = new StringBuilder(sentence);
        strB.reverse();
        return strB.toString();
    }

    public int countLinuxUsers(List<User> users) {
        final String LINUX =  "Linux";
        int linuxCount = 0;

        for (User usr : users) {
            if ( LINUX.equalsIgnoreCase(usr.getType()) ) linuxCount++;
        }

        return linuxCount;
    }
}
