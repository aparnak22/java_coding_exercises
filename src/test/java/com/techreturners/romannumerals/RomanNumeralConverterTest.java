package com.techreturners.romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter rnConverter;

    @Before
    public void setUp(){
        rnConverter = new RomanNumeralConverter();
    }

    @Test
    public void testConvertingOneDigit(){
        assertEquals(1,rnConverter.getDecimalNumberFor("I"));
        assertEquals(5,rnConverter.getDecimalNumberFor("V"));
        assertEquals(10,rnConverter.getDecimalNumberFor("X"));
    }

    @Test
    public void testConvertingTwoDigits(){
        assertEquals(2,rnConverter.getDecimalNumberFor("II"));
        assertEquals(4,rnConverter.getDecimalNumberFor("IV"));
        assertEquals(6,rnConverter.getDecimalNumberFor("VI"));
        assertEquals(9,rnConverter.getDecimalNumberFor("IX"));
        assertEquals(11,rnConverter.getDecimalNumberFor("XI"));
        assertEquals(20,rnConverter.getDecimalNumberFor("XX"));
    }

    @Test
    public void testConvertingThreeDigits(){
        assertEquals(3,rnConverter.getDecimalNumberFor("III"));
        assertEquals(7,rnConverter.getDecimalNumberFor("VII"));
        assertEquals(12,rnConverter.getDecimalNumberFor("XII"));
    }


    @Test
    public void testConvertingFourDigits(){
        assertEquals(8,rnConverter.getDecimalNumberFor("VIII"));
        assertEquals(13,rnConverter.getDecimalNumberFor("XIII"));
        assertEquals(4,rnConverter.getDecimalNumberFor("IV"));
        assertEquals(8,rnConverter.getDecimalNumberFor("VIII"));
    }

    @Test
    public void testAllNumbers1to10(){
        assertEquals(1,rnConverter.getDecimalNumberFor("I"));
        assertEquals(2,rnConverter.getDecimalNumberFor("II"));
        assertEquals(3,rnConverter.getDecimalNumberFor("III"));
        assertEquals(4,rnConverter.getDecimalNumberFor("IV"));
        assertEquals(5,rnConverter.getDecimalNumberFor("V"));
        assertEquals(6,rnConverter.getDecimalNumberFor("VI"));
        assertEquals(7,rnConverter.getDecimalNumberFor("VII"));
        assertEquals(8,rnConverter.getDecimalNumberFor("VIII"));
        assertEquals(9,rnConverter.getDecimalNumberFor("IX"));
        assertEquals(10,rnConverter.getDecimalNumberFor("X"));
    }

    @Test
    public void testAllNumbers11to20(){
        assertEquals(11,rnConverter.getDecimalNumberFor("XI"));
        assertEquals(12,rnConverter.getDecimalNumberFor("XII"));
        assertEquals(13,rnConverter.getDecimalNumberFor("XIII"));
        assertEquals(14,rnConverter.getDecimalNumberFor("XIV"));
        assertEquals(15,rnConverter.getDecimalNumberFor("XV"));
        assertEquals(16,rnConverter.getDecimalNumberFor("XVI"));
        assertEquals(17,rnConverter.getDecimalNumberFor("XVII"));
        assertEquals(18,rnConverter.getDecimalNumberFor("XVIII"));
        assertEquals(19,rnConverter.getDecimalNumberFor("XIX"));
        assertEquals(20,rnConverter.getDecimalNumberFor("XX"));
    }


}
