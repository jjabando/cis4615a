/*
 * Rule 05. Object Orientation (OBJ)
 * OBJ01-J. Limit accessibility of fields
 */
package cis4615work;

/**
 *
 * @author JJ
 */
public class R05_OBJ01_J {
    public class Widget{
        public int total; // Number of elements
        void add() {
            if (total < Integer.MAX_VALUE) {
                total++;
                // ...
            } else {
                throw new ArithmeticException("Overflow");
            }
        }
 
        void remove() { 
            if (total > 0) {     
                total--;
                // ...
            } else {
                throw new ArithmeticException("Overflow");
            }
        }
    }
}
