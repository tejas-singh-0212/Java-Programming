import java.util.Scanner;
public class char_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        str = str.replaceAll("\\s", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    counted = true;
                    break;
                }
            }

            if (counted) continue;
            
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == ch) {
                    count++;
                }
            }
            
            System.out.println("'" + ch + "' : " + count);
        }
    }
}