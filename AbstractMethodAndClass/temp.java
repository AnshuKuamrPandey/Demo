import java.util.Arrays;

public class temp {
	static void swap(int arr[],int e1,int e2) {
		int temp = arr[e1];
		arr[e1] = arr[e2];
		arr[e2] = temp;
	}

	
	static void BubbleSort(int arr[] , int n) {
		
		for(int i = 0;i<n-1;i++) {
			int last = n-i-1;
			for(int j = 0;j<last;j++) {
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		int arr[] = {7,8,6,5,4};
		int n = arr.length;
		BubbleSort(arr,n);
		System.out.println(Arrays.toString(arr));
		
		
		

	}
	}