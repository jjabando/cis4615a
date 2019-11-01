/*
 * Rule 03: Numeric Types and Operations (NUM)
 * NUM03-J. Use integer types that can fully represent the possible range of unsigned data
 */
package cis4615work;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author JJ
 */
public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException{
        return is.readInt(); 
    }
    void execute(){
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println(getInteger(dis));
        }catch(IOException ex){
            System.out.println("Input could not be read!");
        }
    }
}
