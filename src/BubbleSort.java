import java.util.*;
public class BubbleSort {
	   static int[] bubbleSort(int[] arr) {
		      int n = arr.length;
		      int temp = 0;

		      for(int i = 0; i < n; i++) {
		         for(int j=1; j < (n-i); j++) {
		            if(arr[j-1] > arr[j]) {
		               temp = arr[j-1];
		               arr[j-1] = arr[j];
		               arr[j] = temp;
		            }
		         }
		      }
		      return arr;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size : ");
		int n = s.nextInt();
		System.out.println("Enter an Array: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		a = bubbleSort(a);
		for(int j = 0;j<n;j++) {
			System.out.print(a[j] + " ");
		}
	}

}

