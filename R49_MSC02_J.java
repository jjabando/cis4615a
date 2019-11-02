/*
 * Jesse Jamieson Abando
 * Rule 49: Miscellaneous (MSC)
 * MSC02-J. Generate strong random numbers
 */

import java.util.Random;

public class R49_MSC02_J{
    public static void main(String[] args){
        Random number = new Random(123L);
        //...
        for (int i = 0; i < 20; i++) {
            // Generate another random integer in the range [0, 20]
            int n = number.nextInt(21);
            System.out.println(n);
        }
    }
}