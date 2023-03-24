public class bai_2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0 ; i < arr.length; i ++){
            sum += arr[i];
        }
        System.out.println("Sum is = " + sum);

        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i ++ ){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max is = " + max);


    }

}
