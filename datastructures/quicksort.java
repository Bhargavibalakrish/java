package javaclass;
import java.util.Arrays;
public class quicksort {
int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j=right;
        while(i<j) {
        	while(i<=right && pivot>arr[i]) {{
        		i++;
        	}
        	while(j>=left && pivot<arr[j]) {
        		j--;
        	}
        	if(i<j) {
        		swap(arr,i,j);
        	}
        	}
        	swap(arr,pivot,j);
        }
    	return j;

        }
void swap(int[] arr, int i, int j) {
	int temp= arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

void quicsort(int[] arr, int left, int right) {
	while(left<right) {
		int pivot= partition(arr,left, right);
		quicsort(arr,left,pivot-1);
		quicsort(arr,pivot+1,right);
	}
}
	public static void main(String[] args) {
		int[] arr= {7,8,2,5,6,3,9,4,1};
		quicksort qs=new quicksort();
		qs.quicsort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		

	}

}
