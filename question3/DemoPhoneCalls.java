package HomeWork5.question3;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        PhoneCall p1 = new IncomingPhoneCall("09123456789");
        PhoneCall p2 = new OutgoingPhoneCall("09352431901", 3.5);

        p1.displayInformation();
        p2.displayInformation();
    }

}
