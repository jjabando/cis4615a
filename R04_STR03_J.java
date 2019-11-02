/*
 * Jesse Jamieson Abando
 * Rule 04: Characters and Strings
 * STR03-J. Do not encode noncharacter data as a string
 */

import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args){
        System.out.println("Original value: 530500452766");
        
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        
        System.out.println("Compliant function value: " + x);
    }
}
