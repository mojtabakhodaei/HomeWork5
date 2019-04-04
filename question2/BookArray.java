package HomeWork5.question2;

public class BookArray {
    public static void main(String[] args) {
        Fiction book01 = new Fiction("To Kill a Mockingbird");
        Fiction book02 = new Fiction("1984");
        Fiction book03 = new Fiction("The Great Gatsby");
        Fiction book04 = new Fiction("Harry Potter and the Sorcerer's Stone");
        Fiction book05 = new Fiction("Animal Farm");
        Fiction book06 = new Fiction("The Catcher in the Rye");

        NonFiction book07 = new NonFiction("The Diary of a Young Girl");
        NonFiction book08 = new NonFiction("The Immortal Life of Henrietta Lacks");
        NonFiction book09 = new NonFiction("Bossypants");
        NonFiction book10 = new NonFiction("Into the Wild");

        Book[] books = {book01,book02,book03,book04,book05,book06,book07,book08,book09,book10};

        for (int i = 0; i < 10; i++) {
            System.out.println("title: \"" + books[i].title + "\"" + "\nprice: " + books[i].price );
        }
    }

}
