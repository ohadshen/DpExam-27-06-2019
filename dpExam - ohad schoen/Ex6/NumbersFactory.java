package Ex6;

public class NumbersFactory {
    public static double createNumber(NumberToCreate numberToCreate) {
        return Math.pow(numberToCreate.getNumberBase(), numberToCreate.getNumberExponent());
    }
}
