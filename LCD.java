import java.util.ArrayList;

public class LCD {
    
    public void leastCommonDenominator(int a, int b) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ints.add(0, i);
                }
            }
            System.out.println(a / ints.get(0) + "/" + b / ints.get(0));
        }
        
        else if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    ints.add(0, i);
                }
            }
            System.out.println(a / ints.get(0) + "/" + b / ints.get(0));
        }
        
        else {
            System.out.println("1");
        }
        
    }
    
    public static void main(String[] args) {
        LCD fraction = new LCD();
        fraction.leastCommonDenominator(1238912, 13212);
    }
}