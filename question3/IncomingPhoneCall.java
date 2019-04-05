package HomeWork5.question3;

public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super.phoneNumber = phoneNumber;
        this.price = 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void displayInformation() {
        System.out.println("phone number: " + this.phoneNumber + " , rate: 0.02 , price: " + this.price);
    }
}
