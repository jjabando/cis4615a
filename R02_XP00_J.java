/*
 * Jesse Jamieson Abando
 * Rule 02: Expressions (EXP)
 * XP00-J. Do not ignore values returned by methods
 */

import java.io.File;

public class R02_XP00_J{
    public static void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
        // Handle failure to delete the file
        }
    }
    public static void main(String[] args){
        System.out.println("Creating and correctly deleting a file...");
        deleteFile();
    }
}
