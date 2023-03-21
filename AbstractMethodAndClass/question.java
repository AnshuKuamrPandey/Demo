import java.util.*;
public class question {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        //20,30,40,10
        int arr2 [] = {1,2,3};
        //2,3,1
        for (int i = 0 ; i<arr.length-1 ; i++){
         int tem = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = tem;


           


        }
        System.out.println(Arrays.toString(arr));
    }
}
    



    
    

