/*
 * Jesse Jamieson Abando
 * Rule 07: Exceptional Behavior (ERR)
 * ERR02-J: Prevent exceptions while logging data
 */

import java.io.IOException;

public class R07_ERR02_J{
    public static void main(String[] args){
        try {
            // ...
        } catch (SecurityException se) {
            System.err.println(se);
            // Recover from exception
        }
    }
}