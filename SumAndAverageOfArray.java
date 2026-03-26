import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        if(size <= 0) {
            System.err.println("Invalid size");
            System.exit(0);
        }

        int[] arr = new int[size];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double)sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}