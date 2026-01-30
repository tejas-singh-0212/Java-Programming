import java.util.Scanner;
public class first_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int first_dup_idx = -1;
        char dup_char = '\0';
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    first_dup_idx = i;
                    dup_char = ch;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if (first_dup_idx != -1) {
            System.out.println("First duplicate character: '" + dup_char + "'");
            System.out.println("First occurrence index: " + first_dup_idx);
        } else {
            System.out.println("No duplicate characters found.");
        }
    }
}