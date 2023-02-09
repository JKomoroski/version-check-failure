package ski.komoro;

import com.twilio.type.PhoneNumber;

public class Application {

    public static void main(final String[] args) {
        final var phoneNumber = new PhoneNumber("+18005551234");
        System.out.println("Phone Number: " + phoneNumber);
    }
}
