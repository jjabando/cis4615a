/*
 * Jesse Jamieson Abando
 * Rule 05. Object Orientation (OBJ)
 * OBJ01-J. Limit accessibility of fields
 */

public class R05_OBJ01_J {
    public static class Widget{
        private int total; // Number of elements
        public int getTotal (){
            return total;
        }
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
    public static void main(String[] args) {
        Widget mywidget = new Widget();
        mywidget.add();
        mywidget.add();
        System.out.println("mywidget has 2 elements == " + mywidget.getTotal());
        mywidget.remove();
        System.out.println("mywidget has 1 element == " + mywidget.getTotal());
        mywidget.total = 5;
        System.out.println("However, an outer class can access its inner class' private fields: mywidget.total = " + mywidget.total);
    }
}
