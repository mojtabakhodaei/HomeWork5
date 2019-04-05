package HomeWork5.question3;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] calls = new PhoneCall[8] ;

        calls[0] = new IncomingPhoneCall("09145553219");
        calls[1] = new IncomingPhoneCall("09126516793");
        calls[2] = new IncomingPhoneCall("09354098932");
        calls[3] = new OutgoingPhoneCall("09126576590" , 3.0);
        calls[4] = new OutgoingPhoneCall("09134512989" , 16.5);
        calls[5] = new OutgoingPhoneCall("09378764838" , 20.0);
        calls[6] = new OutgoingPhoneCall("09212349090" , 32.5);
        calls[7] = new OutgoingPhoneCall("09123416567" , 0.5);

        for (int i=0 ; i<8 ; i++){
            calls[i].displayInformation();
        }
    }
}
