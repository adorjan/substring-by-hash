package com.example;

/**
 * Describe class.
 *
 * @author daniel
 */
public class MyString {
    private static final int ALPHA = 31;
    private static final int MOD = 257;
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
    public int hash() {
        return 42;
    }

    public int substring(MyString substring) {
        return -1;
    }

    public char at(int i) {
        return chars[i];
    }
}
