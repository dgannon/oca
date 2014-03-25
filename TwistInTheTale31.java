class Phone {
    String phoneNumber = "123456789";
    void setNumber () {
        String phoneNumber;
        phoneNumber = "987654321";
    }
}

public class TwistInTheTale31 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println(p1.phoneNumber);
	System.out.println("This Program shows how variables with different " +
                           "scopes but the same name are handled.  Use this " +
                           "to access the field of the class.");
    }
}

