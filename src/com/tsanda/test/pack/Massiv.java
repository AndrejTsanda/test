package com.tsanda.test.pack;

/**
 * @author Tsanda Andrej
 *
 * Created by andrej on 14.11.2019
 */

public class Massiv {

    private String[] massiv;

    public Massiv(int n) {
        massiv = new String[n];
    }

    public String getElement(int i) {
        return massiv[i];
    }

    public void setElement(int i, String s) {
            massiv[i] = s;
    }

    public void showMassiv() {
        for (String s : massiv) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public int getLength() {
        return massiv.length;
    }
}
