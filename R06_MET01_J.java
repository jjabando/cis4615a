/*
 * Jesse Jamieson Abando
 * Rule 06. Methods (MET)
 * MET01-J. Never use assertions to validate method arguments
 */

public class R06_MET01_J{
    
    public static int getAbsAdd(int x, int y){
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE){
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY){
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }
    public static void main(String[] args) {
        int a = 17;       
        System.out.println("a = " + a);
        int b = 42;       
        System.out.println("b = " + b);       
        int c = getAbsAdd(a, b);       
        System.out.println("c = " + c);
        
        a = Integer.MIN_VALUE; //used for testing secure version       
        System.out.println("a = " + a);       
        b = Integer.MAX_VALUE;       
        System.out.println("b = " + b);       
        c = getAbsAdd(a, b);       
        System.out.println("c = " + c);
    }
}
