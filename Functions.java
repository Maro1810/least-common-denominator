public class Functions {
    
    public void powerRule(int[] coefficients) {
        StringBuilder derivative = new StringBuilder();
        int power = coefficients.length-2;
        for (int i = 0; i < coefficients.length-1; i++) {
            derivative.append(coefficients[i]*((power+1) - i));
            if ((power-i) > 1) {
                derivative.append("x^" + ((power) - i));
            }
            else if ((power-i) == 1) {
                derivative.append("x");
            }
            if (i != (coefficients.length-2)) {
                derivative.append("+");
            }
        }
        if (coefficients.length == 1) {
            System.out.println("0");
        }
        else {
            System.out.println(derivative);
        }
        
    }

    public void binomialChainRule(int coefficient, int number, int power) {
        String posOrNeg = null;
        if (number > 0) {
            posOrNeg = "+";
        }
        else posOrNeg = "-";

        System.out.println(coefficient*power + "(" + coefficient + "x" + posOrNeg + number + ")^" + (power-1));
    }

}
