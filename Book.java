package HomeWork5;

abstract public class Book {
    protected String title;
    protected Double price;

    public  Book (String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    abstract public void setPrice()

}