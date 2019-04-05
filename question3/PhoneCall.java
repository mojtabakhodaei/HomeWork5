package HomeWork5.question3;

abstract public class PhoneCall {
    protected String phoneNumber;
    protected Double price;

    public PhoneCall(){}

    public PhoneCall(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setPrice() {
        this.price = 0.0;
    }

    abstract public String getPhoneNumber();
    abstract public Double getPrice();
    abstract public void displayInformation();

}
