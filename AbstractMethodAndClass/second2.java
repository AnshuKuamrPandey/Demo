import java.util.*;
public class second2 {
    public static void main(String[] args) {
        int arr [] = {50,40,30,20,10};
        for (int i = 0;       i<arr.length ; i++){
            for (int j = i+1; j<arr.length; j++ ){
                
                if (arr[i]>arr[j]){
                      int tem = 0;
                     tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;

                }
            }
        }
           System.out.println(Arrays.toString(arr));  
      

    }
}


    
                
                    











          
