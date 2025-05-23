package may6;

import java.util.Scanner;

public class ScannerAssignment {
    public static void main(String[] args) {

        /*
        internet is down ---- call tech support
        press 1 for english
                        1. Tech Support
                        2. Billing
                        3. Payment arrangement
                        4. sales
         press 2 for French
                        1. Tech Support
                        2. Billing
                        3. Payment arrangement
                        4. sales
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your language preference(English/French):");

        String language = scanner.nextLine();

        switch (language) {
            case "English","english","en":
                System.out.println("Press 1 for Tech Support");
                System.out.println("Press 2 for Billing");
                System.out.println("Press 3 for Payment arrangement");
                System.out.println("Press 4 for sales");

                System.out.println("Enter your choice:");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Connecting to Tech Support");
                        break;
                    case 2:
                        System.out.println("connecting to Billing");
                        break;
                    case 3:
                        System.out.println("Connecting to Payment arrangement");
                        break;
                    case 4:
                        System.out.println("Connecting to Sales");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            case "French","french","fr":
                System.out.println("Press 1 for Tech Support");
                System.out.println("Press 2 for Billing");
                System.out.println("Press 3 for Payment arrangement");
                System.out.println("Press 4 for sales");

                System.out.println("Enter your choice:");
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Connexion au support technique");
                        break;
                    case 2:
                        System.out.println("Connexion à la facturation");
                        break;
                    case 3:
                        System.out.println("Connexion à l'accord de paiement");
                        break;
                    case 4:
                        System.out.println("Connexion aux ventes");
                        break;
                    default:
                        System.out.println("Choix invalide");
                        break;
                }
                break;

            default:
                System.out.println("Invalid language choice");
        }
    }
}