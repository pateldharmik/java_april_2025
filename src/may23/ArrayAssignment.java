package may23;

import java.util.Scanner;

public class ArrayAssignment {
    //Write a program to add reverse String Array.
    //Write a program to add 2 2D arrays

    Scanner input = new Scanner(System.in);

    public void addArray() {

        int x, y;

        //Getting the numbers of x rows in the 2D array
        System.out.println("Enter the length of the array:");
        x = input.nextInt();

        //Getting the numbers of y columns in the 2D array
        System.out.println("Enter the width of the array:");
        y = input.nextInt();

        //Getting the first 2D array elements
        int[][] array1 = new int[x][y];

        System.out.println("Enter the elements of the first array:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = input.nextInt();
            }
        }

        //Getting the second 2D array elements
        int[][] array2 = new int[x][y];
        System.out.println("Enter the elements of the first array:");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = input.nextInt();
            }
        }

        //Adding the 2 2D arrays
        int[][] result = new int[x][y];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        //Printing the values of the 2 2D arrays
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char[] StringReverse(char[] name) {

//        int x;

//        System.out.println("Enter the length of the character array:");
//        x = input.nextInt();

//        System.out.println("Enter the characters of the string:");
//        for (int i = 0; i < name.length; i++) {
//            name[i] = input.next().charAt(0);
//        }

        char temp;

        for (int i = 0; i < name.length / 2; i++) {
            temp = name[i];
            name[i] = name[name.length - i - 1];
            name[name.length - i - 1] = temp;
        }
        return name;
    }
}
