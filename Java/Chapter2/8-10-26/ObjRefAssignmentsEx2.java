// Example of Object Reference Assignment

class Shop {

    String component;
    double price;
}


public class ObjRefAssignmentsEx2 {

    public static void main(String[] args) {

        // Create one Shop object
        Shop p1 = new Shop();

        // Set the details of the laptop
        p1.component = "Laptop";
        p1.price = 50000;

        // p2 does NOT create a new object.
        // p2 refers to the same object as p1.
        Shop p2 = p1;

        // Change the price using p2
        p2.price = 45000;

        // Both p1 and p2 refer to the same object,
        // so both will show the updated price.
        System.out.println("Price using p1: " + p1.price);
        System.out.println("Price using p2: " + p2.price);
    }
}