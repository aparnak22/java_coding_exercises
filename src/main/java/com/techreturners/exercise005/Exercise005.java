package com.techreturners.exercise005;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise005 {

    /*
    Implemented the Pangram checker method using the Set datastructure to keep
    track of the number of unique alphabets found.
    TODO: Is there a more efficient way to solve this ?
     */
    public boolean isPangram(String input) {
        Set<Character> alphabetList = new TreeSet<>();
        int len = input.length();
        boolean allAlphabetsFound = false;
        for (int i = 0; i < len && !allAlphabetsFound ; i++) {
            Character c = Character.toLowerCase(input.charAt(i));
            // if c is an English Alphabet
            if ( 'a' <= c && c <='z') {
                alphabetList.add(c);
            }
            allAlphabetsFound = ( alphabetList.size() == 26) ;
        }
        return allAlphabetsFound;
    }

}
