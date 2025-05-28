package may23;

public class ArrayGetMaxMin {
    public static void main(String[] args) {

        ArrayMaxMin ar = new ArrayMaxMin();

        //ar.getNumbers();

        //  ar.getMax();
        //ar.getMin();
        //ar.printValues();

        int[] x = {1, 2, 3, 4, 5};

        int result = ar.maxValues(x);
        System.out.println("Maximum is: " + result);
    }
}
