package HomeWork5.question4;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {

        Boolean bool = false;

        for (int i = 0; i <= 9; i++) {
            if (address.contains(Integer.toString(i)))
                bool = true;
        }


        if (bool) {
            super.address = address;
            super.rate = 15.0;
        } else {
            System.out.println("Please enter valid address!");
            super.rate = 0.0;
        }

    }
}
