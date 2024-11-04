package buhakov.javaBasic.hometasks.hometask01;

public class Customers {
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {
        int orderNo = 1;
        String client = "Alice";
        String product = "smartphone";
        double price = 305.99;
        String address = "Moon Street, 10.";

        System.out.println("Order No " + orderNo + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + CURRENCY + " " + price + ".");
        System.out.println("Address: " + address);


//      Client #2
        orderNo = 2;
        client = "Tom";
        product = "laptop";
        price = 570.95;
        address = "Terra Street, 17.";

        System.out.println("Order No " + orderNo + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + CURRENCY + " " + price + ".");
        System.out.println("Address: " + address);
    }
}
