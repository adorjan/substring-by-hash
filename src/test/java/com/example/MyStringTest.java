package com.example;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Describe class.
 *
 * @author daniel
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyStringTest {

    @Test
    public void testShouldReturnNegativeOneWhenNoSubstringMatch() {
        // GIVEN
        MyString str = new MyString("This is a dummy test string.");
        MyString nonMatchingSubstring = new MyString("no-match");

        // WHEN
        int substringPosition = str.substring(nonMatchingSubstring);

        // THEN
        assertThat(substringPosition, is(-1));
    }

    @Test
    public void testShouldReturnNegativeOneWhenSubstringIsLonger() {
        // GIVEN
        MyString str = new MyString("Short");
        MyString nonMatchingSubstring = new MyString("This string is longer");

        // WHEN
        int substringPosition = str.substring(nonMatchingSubstring);

        // THEN
        assertThat(substringPosition, is(-1));
    }

    @Test
    public void testShouldReturnPositionOfFirstMatchWhenSubstringFound() {
        // GIVEN
        MyString str = new MyString("Find me some substring please!");
        MyString nonMatchingSubstring = new MyString("substring");

        // WHEN
        int substringPosition = str.substring(nonMatchingSubstring);

        // THEN
        assertThat(substringPosition, is(13));
    }

}