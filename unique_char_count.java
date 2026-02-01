import java.util.Scanner;
public class unique_char_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    counted = true;
                    break;
                }
            }
            if (!counted) {
                count++;
            }
        }
        System.out.println("Total number of unique characters: " + count);
    }
}