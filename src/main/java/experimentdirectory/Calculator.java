package experimentdirectory;

public class Calculator {

    private double getRequiredQuantity(double concentrationOfSol, double concentrationtOfReqdSol) {
//        using formula c1v1 = c2v2
        final double quantityOfSol = 1;
        return ((concentrationOfSol * quantityOfSol) / concentrationtOfReqdSol) - quantityOfSol;
    }

    private double getConcentration(double concentrationOfSol, double quantityOfWater) {
//        using formula c1v1 = c2v2
        final double quantityOfSol = 1;
        return (concentrationOfSol * quantityOfSol) / (quantityOfSol + quantityOfWater);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.getRequiredQuantity(0.06, 0.01));
    }
}
