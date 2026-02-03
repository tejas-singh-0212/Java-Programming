import java.util.Scanner;
public class array_rotation {
    static void arr_reverse(int[] arr, int start, int end){
        for(int i=start, j=end; i<j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void arr_rotate(int[] arr, int rotate, int size){
        arr_reverse(arr, 0, size-1);
        arr_reverse(arr, 0, rotate-1);
        arr_reverse(arr, rotate, size-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" integers:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of steps of rotation: ");
        int k = sc.nextInt();
        k = k % n;
        arr_rotate(arr, k, n);
        System.out.println("Rotated Array");
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
}