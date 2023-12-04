import java.util.Scanner;

public class answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string : ");
        int n = sc.nextInt();
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        System.out.println(minimumRepaint(str, n));
        sc.close();
    }

    static int minimumRepaint(String str, int n) {
        // already in single color
        if (str.length() == 1) {
            return 0;
        }

        // first character
        char compare = str.charAt(0);
        int miniContiB = 0;
        int miniContiW = 0;

        for (int j = 0; j < n; j++) {
            // for first occurance increase
            if (j == 0) {
                if (compare == 'B') {
                    miniContiB++;
                } else {
                    miniContiW++;
                }
            }
            // compare and get continuous no of Black and white
            else if (compare != str.charAt(j)) {
                compare = str.charAt(j);
                if (compare == 'B') {
                    miniContiB++;
                } else {
                    miniContiW++;
                }
            }
        }

        // minimum of Black Or White
        return (miniContiB + miniContiW) / 2;
    }
}

// int s = 1;
// finding transactions
// for (int i = 0; i < c.length() - 1; i++) {
// if (c.charAt(i) != c.charAt(i + 1)) {
// s++;
// }
// }
// return s / 2;
