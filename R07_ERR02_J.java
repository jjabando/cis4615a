/*
 * Jesse Jamieson Abando
 * Rule 07: Exceptional Behavior (ERR)
 * ERR02-J: Prevent exceptions while logging data
 */

import java.io.IOException;
import java.util.function.Supplier;
import java.util.logging.*;

public class R07_ERR02_J{
    static Logger logger = Logger.getLogger(R07_ERR02_J.class.getName());
    public static void main(String[] args){
        try {
            // ...
        } catch (SecurityException se) {
            System.err.println(se);
            logger.log(Level.SEVERE, (Supplier<String>) se);
            // Recover from exception
        }
    }
}