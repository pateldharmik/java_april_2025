package May23;

import java.util.Scanner;

public class ArrayMaxMin {

    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    int max = arr[0];
    int min ;

    public void getNumbers() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + " number:");
            arr[i] = scanner.nextInt();
        }
    }

    /*public void getMax() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }*/

    /*public void getMin() {
        //int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }*/

    public int maxValues(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public void printValues() {
       // System.out.println("Maximum value is: " + max);
        //System.out.println("Minimum value is: " + min);

    }
}
