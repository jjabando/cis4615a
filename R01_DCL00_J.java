/*
 * Jesse Jamieson Abando
 * Rule 01. Declarations and Initialization (DCL)
 * DCL00-J. Prevent class initialization cycles
 */

public class R01_DCL00_J {
    public static class Cycle {
        private final int balance;
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
        private static final Cycle c = new Cycle();

        public Cycle() {
            balance = deposit - 10; // Subtract processing fee
        }
        
        public static void main(String[] args) {
            System.out.println("The account balance is: " + c.balance);
        }
    }
    public static void main(String[] args){
        Cycle.main(args);
    }
}
