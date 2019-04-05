package HomeWork5.question4;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        Boolean bool = false;
            for (int j =0 ; j<address.length() ; j++){
                if (address.charAt(j)== '@')
                    bool=true;
            }

        if(bool) {
            super.address = address;
            super.rate = 9.0;
        }else {
            System.out.println("Please enter valid address!");
            super.rate=0.0;
        }

    }

}
