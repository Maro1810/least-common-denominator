public class Main {
    public static void main(String[] args) {
        LCD fraction = new LCD();
        int[] coefficients = {0, 0, 0, 6};
        Functions functions = new Functions();
        fraction.leastCommonDenominator(846, 13212);
        functions.powerRule(coefficients);

        functions.binomialExpansion(1, 1, 5);

    }
}
