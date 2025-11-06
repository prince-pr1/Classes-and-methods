import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Car> dealership = new ArrayList<>();

        dealership.add(new Car("Evoque", "Range rover", 2025, 300000, "Black", 10));

        boolean run = true;

        while (run) {
            System.out.println("\n========== Car Dealership Menu ==========");
            System.out.println("1. View All Cars");
            System.out.println("2. Sell Car");
            System.out.println("3. Deliver Cars");
            System.out.println("4. Change Car Details");
            System.out.println("5. Add New Car Stock");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nCurrent Stock:");
                    for (int i = 0; i < dealership.size(); i++) {
                        System.out.println(i + ": " + dealership.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Enter Car Index To Sell: ");
                    int sellIdx = input.nextInt();
                    System.out.print("Enter amount to sell: ");
                    dealership.get(sellIdx).sell(input.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Car Index To Deliver: ");
                    int delIdx = input.nextInt();
                    System.out.print("Enter amount delivered: ");
                    dealership.get(delIdx).delivery(input.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Car Index To Modify: ");
                    int modIdx = input.nextInt();
                    input.nextLine();

                    System.out.println("What do you want to change?");
                    System.out.println("1. Model");
                    System.out.println("2. Brand");
                    System.out.println("3. Year");
                    System.out.println("4. Price");
                    System.out.println("5. Color");
                    int field = input.nextInt();
                    input.nextLine();

                    switch (field) {
                        case 1:
                            System.out.print("New model: ");
                            dealership.get(modIdx).setModel(input.nextLine());
                            break;
                        case 2:
                            System.out.print("New brand: ");
                            dealership.get(modIdx).setBrand(input.nextLine());
                            break;
                        case 3:
                            System.out.print("New year: ");
                            dealership.get(modIdx).setYear(input.nextInt());
                            break;
                        case 4:
                            System.out.print("New price: ");
                            dealership.get(modIdx).setPrice(input.nextDouble());
                            break;
                        case 5:
                            System.out.print("New color: ");
                            dealership.get(modIdx).setColor(input.nextLine());
                            break;
                        default:
                            System.out.println("Invalid field!");
                    }
                    break;

                case 5:
                    System.out.println("Enter New Car Details:");
                    System.out.print("Model: ");
                    String model = input.nextLine();
                    System.out.print("Brand: ");
                    String brand = input.nextLine();
                    System.out.print("Year: ");
                    int year = input.nextInt();
                    System.out.print("Price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Color: ");
                    String color = input.nextLine();
                    System.out.print("Quantity: ");
                    int quantity = input.nextInt();

                    dealership.add(new Car(model, brand, year, price, color, quantity));
                    System.out.println("✅ New car added to stock!");
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    run = false;
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
        input.close();
    }
}
