package HomeWork5.question3;

abstract public class PhoneCall {
    protected String phoneNumber;
    protected Double price;

    public PhoneCall(String phoneNumber){
        this.phoneNumber=phoneNumber;
        this.price=0.0;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    abstract public String getPhoneNumber();
    abstract public Double getPrice();
    abstract public String displayInformation();

}
