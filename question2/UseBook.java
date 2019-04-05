package HomeWork5.question2;

public class UseBook {
    public static void main(String[] args) {
        Book book1 = new Fiction("Harry Potter");
        Book book2 = new NonFiction("Physics");

        System.out.println("Showing books fields");
        System.out.println("book1 title: \"" + book1.title + "\"" + "\nbook1 price: " + book1.price);
        System.out.println("book2 title: \"" + book2.title + "\"" + "\nbook2 price: " + book2.price);
    }
}
