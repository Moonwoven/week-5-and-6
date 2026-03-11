import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        if(size <= 0) {
            System.err.println("Invalid size");
            System.exit(0);
        }

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);

        sc.close();
    }
}