import java.util.Scanner;
public class uppercase_lowercase_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        str = str.replaceAll("\\s", "");
        int upper_count = 0;
        int lower_count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper_count++;
            } else if (Character.isLowerCase(ch)) {
                lower_count++;
            }
        }
        System.out.println("Uppercase count: " + upper_count);
        System.out.println("Lowercase count: " + lower_count);
    }
}