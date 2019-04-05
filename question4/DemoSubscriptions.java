package HomeWork5.question4;

public class DemoSubscriptions {
    public static void main(String[] args) {
        NewspaperSubscription sub1 = new PhysicalNewspaperSubscription();
        sub1.setName("Mr. moradi");
        sub1.setAddress("tehran pelak 1 ");

        NewspaperSubscription sub2 = new PhysicalNewspaperSubscription();
        sub2.setName("Ms. javid");
        sub2.setAddress("kashan pelak 23 ");

        NewspaperSubscription sub3 = new OnlineNewspaperSubscription();
        sub3.setName("Mr. kazemi");
        sub3.setAddress("javadkazemi@gmail.com");

        NewspaperSubscription sub4 = new OnlineNewspaperSubscription();
        sub4.setName("Mr. vahidi");
        sub4.setAddress("vahidi0918@yahoo.com");

        System.out.println("\nname: " + sub1.getName() + "\naddress: " + sub1.getAddress() + "\nrate: " + sub1.getRate());
        System.out.println("\nname: " + sub2.getName() + "\naddress: " + sub2.getAddress() + "\nrate: " + sub2.getRate());
        System.out.println("\nname: " + sub3.getName() + "\naddress: " + sub3.getAddress() + "\nrate: " + sub3.getRate());
        System.out.println("\nname: " + sub4.getName() + "\naddress: " + sub4.getAddress() + "\nrate: " + sub4.getRate());

    }
}
