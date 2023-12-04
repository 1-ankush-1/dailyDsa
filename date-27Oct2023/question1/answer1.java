import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class answer1 {
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
        System.out.printf("%s from value of x+y is : %s", Arrays.toString(arr),
                Arrays.toString(twoStackOptimize(arr, size)));
        sc.close();

    }

    static int[] twoStackOptimize(int[] arr, int n) {
        int[] sum = new int[n];
        Stack<Integer> stkLeft = new Stack<>();
        Stack<Integer> stkRight = new Stack<>();

        // left - left to right
        for (int i = 0; i < sum.length; i++) {
            //peek will hold max value - if smaller then pop
            while (!stkLeft.isEmpty() && arr[stkLeft.peek()] <= arr[i]) {
                stkLeft.pop();
            }

            sum[i] = stkLeft.isEmpty() ? -1 : stkLeft.peek() + 1;
            stkLeft.push(i);
        }

        // right - right to left
        for (int i = sum.length - 1; i >= 0; i--) {
            //peek will hold max value - if smaller then pop
            while (!stkRight.isEmpty() && arr[stkRight.peek()] <= arr[i]) {
                stkRight.pop();
            }
            //because we are using sum array not different array for right and left
            sum[i] = !stkRight.isEmpty() ? sum[i] + (stkRight.peek() + 1) : sum[i] + -1;
            stkRight.push(i);
        }

        return sum;
    }

    static int[] Better(int[] arr, int n) {
        int[] sumOfXY = new int[n];
        for (int i = 0; i < n; i++) {
            // right
            int left = -1;
            int right = -1;
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) {
                    right = j + 1;
                    break;
                }
            }
            // left
            for (int k = i; k >= 0; k--) {
                if (arr[i] < arr[k]) {
                    left = k + 1;
                    break;
                }
            }
            sumOfXY[i] = left + right;
        }

        return sumOfXY;
    }

    static int[] brute(int[] arr, int n) {
        int[] sum = new int[n];

        int[] Left = new int[n];
        int[] Right = new int[n];

        // intialize with -1
        for (int i = 0; i < sum.length; i++) {
            Right[i] = -1;
            Left[i] = -1;
        }

        // right max
        for (int i = 0; i < sum.length - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    Right[i] = j + 1;
                    break;
                }
            }
        }

        // left max
        for (int i = 0; i < sum.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    Left[i] = j + 1;
                    break;
                }
            }
        }

        // sum both
        for (int i = 0; i < sum.length; i++) {
            sum[i] = Left[i] + Right[i];
        }

        return sum;
    }
}