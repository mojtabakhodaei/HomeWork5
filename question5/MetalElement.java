package HomeWork5.question5;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("\nElement: " + getSymbol() + "\natomicNumber: " + getAtomicNumber() + "\natomicWeight: " + getAtomicWeight());
        System.out.println("This Element is good conductor of electricity");
    }
}
