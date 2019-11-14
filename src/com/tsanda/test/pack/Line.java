package com.tsanda.test.pack;

/**
 * @author Tsanda Andrej
 *
 * Created by andrej on 14.11.2019
 */

public class Line {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String s) {
        if (verification(s)) {
            str = s;
        }
    }

    private boolean verification(String s) {
        boolean result = false;
        if (s.length() == 9) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0' | s.charAt(i) == '1') {
                    result = true;
                } else {
                    System.out.println("Error! The string should contain only the characters \"1\" or \"0\". ");
                    result = false;
                    break;
                }
            }
        } else {
            System.out.println("Error! The string length must be 9.");
            result = false;
        }
        return result;
    }

    public int getQuentityOne() {
        int quentity = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                quentity += 1;
            }
        }
        return quentity;
    }

    public int getLength() {
        return str.length();
    }
}
