package HomeWork5;

public class Fiction extends Book {

    @Override
    public void setPrice() {
        this.price = 24.99;
    }

    public Fiction(String title) {
        setPrice();
        this.title = title;
    }
}
