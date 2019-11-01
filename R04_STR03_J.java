/*
 * Rule 04: Characters and Strings
 * STR03-J. Do not encode noncharacter data as a string
 */
package cis4615work;

import java.math.BigInteger;

/**
 *
 * @author JJ
 */
public class R04_STR03_J {
    private void convertInt(){
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        System.out.println("Compliant function value: " + x);
    }
    public void execute(){
        System.out.println("Original value: 530500452766");
        convertInt();
    }
}
