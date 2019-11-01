/*
 * Rule 00: Input Validation and Data Sanitization (IDS)
 * IDS03-J: Do not log unsanitized user input
 */

/**
 *
 * @author JJ
 */
package cis4615work;

import java.util.regex.Pattern;
import java.util.logging.*;

public class R00_IDS03_J{
    
    static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    static String username = "Guest";
    
    static boolean loginSuccessful(){
        return username.equals("Guest");
    }
    static void login(){
        if (loginSuccessful())
            logger.severe("(NONCOMPLIANT) User login succeeded for: " + username);
        else
            logger.severe("(NONCOMPLIANT) User login failed for: " + username);
    }
    
    void execute(){
        login();
    }
}
