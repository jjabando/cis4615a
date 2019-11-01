/*
 * Rule 02: Expressions (EXP)
 * XP00-J. Do not ignore values returned by methods
 */
package cis4615work;
import java.io.File;
/**
 *
 * @author JJ
 */
public class R02_XP00_J{
    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
    }
    void execute(){
        deleteFile();
    }
}
