package com.example;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Describe class.
 *
 * @author daniel
 */
public class MyString {
    private static final BigInteger ALPHA = BigInteger.valueOf(7);
    private static final BigInteger MOD = BigInteger.valueOf(257);
    private final char[] chars;
    public final int length;

    public MyString(String str) {
        chars = str.toCharArray();
        length = chars.length;
    }
    
    /**
     * Todo! compute hash as H(S) = \sum_{i=0}^{abs(S) - 1}(ALPHA^(abs(S)-(i+1)) * char(s_{i}))
     * @return
     */
    public BigInteger hash() {
    	BigInteger hash = BigInteger.valueOf(0);
        
        for(int i = 0; i < length; i++) {
        	hash = hash.add(ALPHA.pow(length - i + 1).multiply(BigInteger.valueOf(at(i))));
        	System.out.println("current: " + hash);
        }
        
        return hash;
    }

    public int substring(MyString substring) {
    	BigInteger subHash = substring.hash();
    	int subLen = substring.length;
    	MyString first = new MyString(String.valueOf(Arrays.copyOfRange(chars, 0, subLen-1)));
    	BigInteger ch = first.hash();
    	for (int i = 0; i < length - subLen; i++) {
    		if (ch.equals(subHash)) {
    			return i;
    		}
    		ch = ch.subtract(ALPHA.pow(length - i + 1).multiply(BigInteger.valueOf(at(i))));
    		ch = ch.add(ALPHA.pow(length - i + subLen).multiply(BigInteger.valueOf(at(i + subLen))));
    	}
        return -1;
    }

    public char at(int i) {
        return chars[i];
    }
}
