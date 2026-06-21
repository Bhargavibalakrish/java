package javaclass;
import java.util.Arrays;
public class bubblesort {
	public static void main(String[] args) {
	int arr[]= {5,9,6,12,5};
	for(int i=0; i<arr.length-1; i++) {
		
		for(int j=0; j<arr.length-i-1;j++) {
			int key=arr[j];
		if(key>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}

	}
	System.out.println(Arrays.toString(arr));
}
}}