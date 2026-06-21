package javaclass;

import java.util.Arrays;


public class mergesort {
	public int[] divide(int[] arr) {
	    if (arr.length <= 1) {
	        return arr;
	    }

	    int mid = arr.length / 2;

	    int[] left = new int[mid];
	    int[] right = new int[arr.length - mid];

	    for (int i = 0; i < mid; i++) {
	        left[i] = arr[i];
	    }

	    for (int i = mid; i < arr.length; i++) {
	        right[i - mid] = arr[i];
	    }

	    left = divide(left);
	    right = divide(right);

	    return merge(left, right);
	}
	
	public int[] merge(int[] arr, int[] brr) {
	int al= arr.length;
	int bl= brr.length;

	int[] crr= new int[al+bl];
	int i= 0, j= 0, k= 0;
	while(i<al && j<bl) {
		if(arr[i]<brr[j]) {
			crr[k]= arr[i];
			i++; k++;
			}
		else {
			crr[k]= brr[j];
			j++; k++;
		}
	}
	while(i<al) {
		crr[k]= arr[i];
		i++; k++;
	}
	while(j<bl) {
		crr[k]= brr[j];
		j++; k++;
	}
	return crr;
}
	public int[] twohalfsort(int[] arr, int start, int mid, int end) {
		int[] crr= new int[end];
		int i= start, j= mid, k= start;
		while(i<mid && j<start) {
			if(arr[i]<arr[j]) {
				crr[k]= arr[i];
				i++; k++;
			}
			else {
				crr[k]= arr[j];
				j++; k++;
			}
		}
		while(i<mid) {
			crr[k]= arr[i];
			i++; k++;
		}
		while(j<end) {
			crr[k]= arr[j];
			j++; k++;
		}
		return crr;
		}
	public static void main(String[] args) {
		int [] arr= {1,2,4,7,5,6,8,9};
		int[] arr3= {7,5,6,9,3,11,16,15,4,2,1,13};
		int end= arr.length;
		int mid= end/2;
		mergesort c= new mergesort();
		System.out.println(Arrays.toString(c.twohalfsort(arr,0,mid,end)));
		System.out.println(Arrays.toString(c.divide(arr3)));
	}
}
