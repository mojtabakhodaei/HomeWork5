package HomeWork5.question3;

public class OutgoingPhoneCall extends PhoneCall {

    Double callTime;

    public OutgoingPhoneCall(String phonenumber, Double callTime) {
        super.phoneNumber = phonenumber;
        this.callTime = callTime;
        this.price = 0.04 * callTime;
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
        System.out.println("phone number: " + this.phoneNumber + " , rate: 0.04" + " , call time: " + callTime + " , price: " + this.price);
    }
}
