package javaclass;

public class Searches{
public static int LinearSearch(int[] arr, int target) {
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==target) {
			return i;
		}
		return -1;
	}
}
public static int LinearSearch2D(int[][] arr, int target) {
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			if(arr[i][j]==target) {
				return new int[] {i,j};
			}
		}
	}
	return -1;
}
public static int LinearSearch(String str,char target) {
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==target) {
			return i;
		}
	}
	return -1;
}
public static int BinarySearch(int[] arr, int target) {
	int mid=arr.length/2;
	if(arr[mid]==target) {
		return mid;
	}
	else if(arr[mid]<target) {
		int[] arr1= new int[arr.length/2];
		for(int k=0; k<arr.length/2; k++) {
			arr1[k]=arr[k];
		}
		return BinarySearch(int[] arr1, int target);
	}
	else if(arr[mid]>target) {
		int[] arr2=new int[arr.length/2];
		for(int k=mid; k<arr.length/2; k++) {
			for(int i=0; i<arr.length/2; i++) {
				arr2[i]=arr[k];
			}
		}
		return BinarySearch(int[] arr2, int target);
	}
	else {
		return -1;
	}
}
}