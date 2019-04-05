package HomeWork5.question5;

abstract public class Element {
    protected String symbol;
    protected int atomicNumber;
    protected double atomicWeight;

    public Element() {
    }

    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    abstract public void describeElement();
}
