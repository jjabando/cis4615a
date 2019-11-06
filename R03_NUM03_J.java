/*
 * Jesse Jamieson Abando
 * Rule 03: Numeric Types and Operations (NUM)
 * NUM03-J. Use integer types that can fully represent the possible range of unsigned data
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class R03_NUM03_J {
    public static long getInteger(DataInputStream is) throws IOException{
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
    public static void main(String[] args){
        DataInputStream dis = new DataInputStream(System.in);
        try{
            System.out.println("Type in 4 characters");
            long x = getInteger(dis);
            byte[] bytes = ByteBuffer.allocate(8).putLong(x).array();
            String str = new String(bytes);
            System.out.println("Your input is: " + str.substring(4));
        }catch(IOException ex){
            System.out.println("Input could not be read!");
        }
    }
}
