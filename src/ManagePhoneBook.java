import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook =new PhoneBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
        System.out.println("1.Insert Phone");
        System.out.println("2.Remove Phone");
        System.out.println("3.Update Phone");
        System.out.println("4.Search Phone");
        System.out.println("5.Sort");
        System.out.println("6.Exit");
        int choice = sc.nextInt();
        while (choice!=6){
            switch (choice) {
                case 1: {
                    System.out.println("nhap ten:");
                    String name = sc.nextLine();
                    System.out.println("nhap so dien thoai");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    phoneBook.show();
                    break;
                }
                case 2: {
                    System.out.println("nhap ten:");
                    String name = sc.next();
                    phoneBook.removePhone(name);
                    phoneBook.show();
                    break;
                }
                case 3: {
                    System.out.println("nhap ten:");
                    String name = sc.nextLine();
                    System.out.println("nhap so dien thoai");
                    String phone = sc.nextLine();
                    phoneBook.updatePhone(name, phone);
                    break;
                }
                case 4:{
                    System.out.println("nhap ten:");
                    String name = sc.nextLine();
                    phoneBook.searchPhone(name);
                    phoneBook.show();
                }
                case 6:
                    System.exit(0);
            }
        }
    }
}
