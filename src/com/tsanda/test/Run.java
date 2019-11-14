package com.tsanda.test;

import com.tsanda.test.pack.Line;
import com.tsanda.test.pack.Massiv;

import java.util.Scanner;

/**
* @author Tsanda Andrej
 *
 * Created by andrej on 14.11.2019
*/

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Line line = new Line();

        while (line.getStr() == null) {
            System.out.print("Enter string: ");
            line.setStr(scanner.nextLine());
        }

        Massiv massiv = new Massiv(line.getLength());
        System.out.println("Enter Massiv: ");
        for (int i = 0; i < massiv.getLength(); i++) {
            System.out.print("Enter Massiv[" + i +"] = ");
            massiv.setElement(i, scanner.nextLine());
        }
        System.out.println("Massiv: ");
        massiv.showMassiv();

        Massiv result = new Massiv(line.getQuentityOne());
        int j = 0;
        for (int i = 0; i < line.getLength(); i++) {
            if (line.getStr().charAt(i) == '1') {
                result.setElement(j, massiv.getElement(i));
                j += 1;
            }
        }
        System.out.println("Result: ");
        result.showMassiv();
    }
}
