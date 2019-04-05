package HomeWork5.question5;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol,atomicNumber,atomicWeight);
    }

    @Override
    public void describeElement(){
        System.out.println("\nElement: "+ super.symbol + "\natomicNumber: " + super.atomicNumber+ "\natomicWeight: " + super.atomicWeight);
        System.out.println("This Element is good conductor of electricity");
    }
}
