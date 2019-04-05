package HomeWork5.question5;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[5];

        elements[0] = new MetalElement("Mg", 12, 24.305);
        elements[1] = new MetalElement("Fe", 26, 55.845);
        elements[2] = new MetalElement("Co", 27, 58.933);
        elements[3] = new NonMetalElement("C", 6, 12.011);
        elements[4] = new NonMetalElement("O", 8, 15.999);

        elements[0].describeElement();
        elements[1].describeElement();
        elements[2].describeElement();
        elements[3].describeElement();
        elements[4].describeElement();
    }
}
