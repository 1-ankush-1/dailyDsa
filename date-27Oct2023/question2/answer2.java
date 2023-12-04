import java.util.HashMap;
import java.util.Scanner;

public class answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array (N):");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of the array:");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        System.out.println(sharpenerEquality(arr, n));

        sc.close();
    }

    static int sharpenerEquality(int[] arr, int n) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {          //number of occurance
            if (dict.containsKey(arr[i])) {
                dict.put(arr[i], dict.get(arr[i]) + 1);
                continue;
            }
            dict.put(arr[i], 1);
        }

        int max = 1;                                //default 1
        for (int key : dict.keySet()) {             //find max 
            if (max < dict.get(key)) {
                max = dict.get(key);
            }
        }

        return arr.length - max;                //minimum operation
    }
}
