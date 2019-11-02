/*
 * Jesse Jamieson Abando
 * Rule 13: Input Output (FIO)
 * FIO02-J. Detect and handle file-related errors
 */

import java.io.File;

public class R13_FIO02_J{
    public static void main(String[] args){
        File file = new File(args[0]);
        file.delete();
    }
}