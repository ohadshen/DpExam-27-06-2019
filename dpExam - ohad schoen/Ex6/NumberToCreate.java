package Ex6;

public class NumberToCreate {
    private int NumberBase;
    private int NumberExponent;

    public NumberToCreate(int numberBase, int numberExponent) {
        NumberBase = numberBase;
        NumberExponent = numberExponent;
    }

    public int getNumberBase() {
        return NumberBase;
    }

    public void setNumberBase(int numberBase) {
        NumberBase = numberBase;
    }

    public int getNumberExponent() {
        return NumberExponent;
    }

    public void setNumberExponent(int numberExponent) {
        NumberExponent = numberExponent;
    }
}
