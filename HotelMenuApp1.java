import java.util.Scanner;

public class HotelMenuApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
            System.out.println("Hotel Menu:");
            System.out.println("1. Burger");
            System.out.println("2. Pizza");
            System.out.println("3. Salad");
            System.out.println("4. Exit");

            System.out.print("Please choose an option: ");
            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    System.out.println("You selected Burger. Choose a type:");
                    System.out.println("1. Chicken Burger - $5.99");
                    System.out.println("2. Beef Burger - $6.99");
                    System.out.println("3. Veggie Burger - $4.99");
                    int burgerChoice = scanner.nextInt();
                    switch (burgerChoice) {
                        case 1:
                            System.out.println("You selected Chicken Burger. The price is $5.99.");
                            break;
                        case 2:
                            System.out.println("You selected Beef Burger. The price is $6.99.");
                            break;
                        case 3:
                            System.out.println("You selected Veggie Burger. The price is $4.99.");
                            break;
                        default:
                            System.out.println("Invalid burger choice. Please try again.");
                    }
                    break;

                case 2:
                    System.out.println("You selected Pizza. Choose a type:");
                    System.out.println("1. Margherita Pizza - $8.99");
                    System.out.println("2. Pepperoni Pizza - $9.99");
                    System.out.println("3. BBQ Chicken Pizza - $10.99");
                    int pizzaChoice = scanner.nextInt();
                    switch (pizzaChoice) {
                        case 1:
                            System.out.println("You selected Margherita Pizza. The price is $8.99.");
                            break;
                        case 2:
                            System.out.println("You selected Pepperoni Pizza. The price is $9.99.");
                            break;
                        case 3:
                            System.out.println("You selected BBQ Chicken Pizza. The price is $10.99.");
                            break;
                        default:
                            System.out.println("Invalid pizza choice. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("You selected Salad. Choose a type:");
                    System.out.println("1. Caesar Salad - $4.99");
                    System.out.println("2. Greek Salad - $5.99");
                    System.out.println("3. Garden Salad - $3.99");
                    int saladChoice = scanner.nextInt();
                    switch (saladChoice) {
                        case 1:
                            System.out.println("You selected Caesar Salad. The price is $4.99.");
                            break;
                        case 2:
                            System.out.println("You selected Greek Salad. The price is $5.99.");
                            break;
                        case 3:
                            System.out.println("You selected Garden Salad. The price is $3.99.");
                            break;
                        default:
                            System.out.println("Invalid salad choice. Please try again.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
				break;
            }
        }
    }
