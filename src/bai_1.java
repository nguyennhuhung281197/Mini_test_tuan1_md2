import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so  N  vao");
        int N = sc.nextInt();
        for (int i = 0; i < N ; i ++){
            if (check(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean check (int number){
        if (number < 2){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(number) ; i ++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
