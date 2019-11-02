/*
 * Jesse Jamieson Abando
 * Rule 00: Input Validation and Data Sanitization (IDS)
 * IDS03-J: Do not log unsanitized user input
 */

import java.util.regex.Pattern;
import java.util.logging.*;

public class R00_IDS03_J{
    
    static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    static String username = "Guest";
    
    static boolean loginSuccessful(){
        return username.equals("Guest");
    }
    static String sanitizeUser(String uname){
        return (Pattern.matches("[A-Za-z0-9_]+", uname)) ? uname : "unauthorized user";
    };
    static void login(){
        if (loginSuccessful())
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        else
            logger.severe("User login failed for: " + sanitizeUser(username));
    }
    
    public static void main(String[] args){
        System.out.println("Logging in Guest and sanitizing input...");
        login();
    }
}
