import java.util.Scanner;

public class puspraj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in );
       int arr[] = {43,22,43,12,43,55,55,2333,3};
       for (int i = 0; i<arr.length; i++){
        for (int j = i+1; j<arr.length; j++ ){
            if(arr[i]>arr[j]){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem ;
            }

        }
       }
          System.out.println(arr[arr.length-2]);
    }
    
}
