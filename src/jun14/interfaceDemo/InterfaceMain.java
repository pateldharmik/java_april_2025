package jun14.interfaceDemo;

import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {

        boolean continuePlaying = true;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("1. Netflix.");
            System.out.println("2. Youtube.");
            System.out.println("3. Udemy.");
            System.out.println("4. MX Player.");
            System.out.println("5. Youtube Music.");
            System.out.println("6. VLC Media Player.");
            System.out.println("7. Spotify.");
            System.out.println("8. Exit.");
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();

            MediaPlayer mp;

            switch (choice) {
                case 1:
                    mp = new Netflix();
                    mp.play();
                    break;

                case 2:
                    mp = new YouTube();
                    mp.play();
                    break;

                case 3:
                    mp = new Udemy();
                    mp.play();
                    break;

                case 4:
                    mp = new MXPlayer();
                    mp.play();
                    break;

                case 5:
                    mp = new YoutubeMusic();
                    mp.play();
                    break;

                case 6:
                    mp = new VLCMediaPlayer();
                    mp.play();
                    break;

                case 7:
                    mp = new Spotify();
                    mp.play();
                    break;

                case 8:
                    System.out.println("Exiting.");
                    continuePlaying = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (continuePlaying);
    }
}
