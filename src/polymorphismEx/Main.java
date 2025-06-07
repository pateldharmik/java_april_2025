package polymorphismEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MasterFirmware firmware = null;


        System.out.println("Enter 1: Honda\nEnter 2: Toyota\nEnter 3: BMW\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                firmware = new HondaFirmware();
                break;
            case 2:
                firmware = new ToyotaFirmware();
                break;
            case 3:
                firmware = new BMWFirmware();
                break;
        }
//
        firmware.abs();
    }
}
