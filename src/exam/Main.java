package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap lan luot thong tin cua san pham.");
        System.out.println("ID:");
        p1.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Name:");
        p1.setName(sc.nextLine());
        System.out.println("Thumbnail:");
        p1.setThumbnail(sc.nextLine());
        System.out.println("Price:");
        p1.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.println("Quantity:");
        p1.setQty(sc.nextInt());
        sc.nextLine();
        System.out.println("Description");
        p1.setDescription(sc.nextLine());


        p1.displayInfo();
        System.out.println("Nhap so luong muon dat hang: ");
        double total = p1.placeOrder(sc.nextInt());
        System.out.println("Tong tien la "+total);





    }
}
