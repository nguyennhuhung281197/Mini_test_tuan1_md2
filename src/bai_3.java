import java.util.Arrays;
import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for (int i = 0 ; i < size ; i ++){
            System.out.println("Nhap phan tu");
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
