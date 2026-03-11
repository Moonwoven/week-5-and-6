import java.util.Scanner;

public class ModifyArrayElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {5,10,15,20,25};

        System.out.print("Enter index to modify: ");
        int index = sc.nextInt();

        if(index < 0 || index >= arr.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        arr[index] = value;

        System.out.println("Updated Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}