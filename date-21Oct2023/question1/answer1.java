import java.util.Arrays;
import java.util.Scanner;

class answer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size on an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value at position : %d is => ", i);
            int value = sc.nextInt();
            arr[i] = value;
        }
        System.out.printf("%s from Arraywood the enchantingSum is : %d", Arrays.toString(arr),
                enchantingSum(arr, size));
        sc.close();
    }

    static int enchantingSum(int[] arr, int n) {
        // to store sum
        int sumOfeven = 0;
        for (int i = 0; i < n; i++) {
            // check if value is even
            if (arr[i] % 2 == 0) {
                sumOfeven += arr[i];
            }
        }
        return sumOfeven;
    }

}