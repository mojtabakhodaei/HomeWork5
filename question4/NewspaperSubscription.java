package HomeWork5.question4;

abstract public class NewspaperSubscription {
    protected String name;
    protected String address;
    protected Double rate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Double getRate() {
        return rate;
    }

    abstract public void setAddress(String address);
}

