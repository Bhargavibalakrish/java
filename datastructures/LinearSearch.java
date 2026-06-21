package javaclass;


public class LinearSearch{
	public static void main(String[] args) {
		int[] arr= {5,6,8,11,23,5,6,9};
		int target = 8;
		Searches a= new Searches();
		int x=a.LinearSearch(arr, target);
		System.out.println(x);
	}
}