import java.util.Scanner;

public class AccessArrayElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if(index < 0 || index >= arr.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        System.out.println("Element = " + arr[index]);

        sc.close();
    }
}