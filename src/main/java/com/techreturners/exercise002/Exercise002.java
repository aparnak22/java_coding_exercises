package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        final String MANCHESTER = "Manchester";
        return MANCHESTER.equalsIgnoreCase(person.getFrom());
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return ageLimit <= person.getAge() ;
    }
    
}
