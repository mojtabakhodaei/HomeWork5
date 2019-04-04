package HomeWork5;

public class NonFiction extends Book {

    @Override
    public void setPrice() {
        this.price=37.99;
    }

    public NonFiction(String title) {
        setPrice();
        this.title = title;
    }
}
