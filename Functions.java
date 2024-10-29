public class Functions {
    
    public void powerRule(int[] coefficients) {
        StringBuilder derivative = new StringBuilder();
        int power = coefficients.length-2;
        for (int i = 0; i < coefficients.length-1; i++) {
            if (coefficients[i] == 0) {
                continue;
            }
            derivative.append(coefficients[i]*((power+1) - i));
            if ((power-i) > 1) {
                derivative.append("x^" + ((power) - i));
            }
            else if ((power-i) == 1) {
                derivative.append("x");
            }
            if (i != (coefficients.length-2 ) && isNonZero(coefficients, i, coefficients.length-2) == true) {
                derivative.append("+");
            }
        }
        if (coefficients.length == 1 || isNonZero(coefficients, -1, coefficients.length-2) == false) {
            System.out.println("0");
        }
        else {
            System.out.println(derivative);
        }
        
    }

    private boolean isNonZero(int[] array, int startingIndex, int endingIndex) {
        for (int i = startingIndex+1; i <= endingIndex; i++) {
            if (array[i] != 0) {
                return true;
            }
        }    
        return false;
    }

    public void binomialChainRule(int coefficient, int number, int power) {
        String posOrNeg = null;
        if (number > 0) {
            posOrNeg = "+";
        }
        else posOrNeg = "-";

        System.out.println(coefficient*power + "(" + coefficient + "x" + posOrNeg + number + ")^" + (power-1));
    }

    public void binomialExpansion(int coefficient, int number, int power) { //in progress, need to handle edge cases
        StringBuilder expandedBinomial = new StringBuilder();
        for (int k = 0; k <= power; k++) {
            expandedBinomial.append(choose(power, k) * (int)(Math.pow(number, k)) + "x^" + (power-k) + "+");
        }
        System.out.println(expandedBinomial);
    }

    private int choose(int n, int r) {
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    }

    private int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
