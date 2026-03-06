package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String name;
        String thumbnail;
        double price;
        int qty;
        String description;

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap lan luot thong tin cua san pham.");
        System.out.println("ID:");
        id = sc.nextInt();
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("thumbnail");
        thumbnail = sc.nextLine();
        System.out.println("Price:");
        price = sc.nextDouble();
        System.out.println("Quantity:");
        qty = sc.nextInt();
        System.out.println("Description");
        description = sc.nextLine();

        Product p1 = new Product(id,name,thumbnail,price,qty,description);


    }
}
