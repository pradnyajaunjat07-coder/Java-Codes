// Create a "Product" class to calculate the final bill for a product purchase. 

import java.util.Scanner;

class Product {
    private String productName;
    private int productId;
    private double unitPrice;
    private int quantity;

    // Parameterized constructor
    Product(String productName, int productId,
            double unitPrice, int quantity) {
        if (productName.trim().isEmpty() || productId <= 0 ||
            !Double.isFinite(unitPrice) || unitPrice <= 0 ||
            quantity <= 0) {
            throw new IllegalArgumentException(
                "Invalid product details, price, or quantity."
            );
        }

        this.productName = productName;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Calculate subtotal
    double calculateSubtotal() {
        return unitPrice * quantity;
    }

    // Calculate discount percentage
    int getDiscountPercentage() {
        double subtotal = calculateSubtotal();

        if (subtotal >= 10000) {
            return 15;
        } else if (subtotal >= 5000) {
            return 10;
        } else if (subtotal >= 1000) {
            return 5;
        } else {
            return 0;
        }
    }

    // Calculate discount amount
    double calculateDiscount() {
        return calculateSubtotal()
               * getDiscountPercentage() / 100.0;
    }

    // Calculate final bill
    double calculateFinalBill() {
        return calculateSubtotal() - calculateDiscount();
    }

    // Display bill details
    void displayBill() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Product: ");
            String name = sc.nextLine();

            System.out.print("Product ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Unit Price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            Product product = new Product(name, id, price, quantity);
            product.displayBill();

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
