import java.util.Scanner;

public class answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        System.out.printf("%s decoded result : %s", str, BreakTheCode(str));
        sc.close();
    }

    static String BreakTheCode(String str) {
        // intialize a string to store all vowel
        String vowel = "aeiou";
        // intialize a stringBuilder
        StringBuilder result = new StringBuilder();
        // loop1 to iterate the string
        for (int i = 0; i < str.length(); i++) {
            // let closestvowel as first
            char closestvowel = vowel.charAt(0);
            // now find the minimum distance between character at ith and closest vowel
            int minDist = Math.abs(str.charAt(i) - closestvowel);
            // loop2 - to compare every charater with string
            for (int j = 1; j < vowel.length(); j++) {
                // get distance from every vowel
                int distfromvowel = Math.abs(str.charAt(i) - vowel.charAt(j));
                // check if it exceed minDist
                if (distfromvowel < minDist) {
                    // replace the minimum distance
                    minDist = distfromvowel;
                    // changed closest character
                    closestvowel = vowel.charAt(j);
                }
            }
            // append the closest vowel
            result.append(closestvowel);
        }
        // return the resultant string
        return result.toString();
    }
}
