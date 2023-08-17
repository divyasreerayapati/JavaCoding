package Sortings;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Creation
		
			System.out.println("Enter size of an Array : ");
			int[] arr = new int[scan.nextInt()];
		
		//Array Intilization
			
			for(int i =0;i<arr.length;i++) {
				System.out.println("Enter "+(i+1)+" Element to find = ");
				arr[i] = scan.nextInt();
			}
			
		//Before Array is Sorted 
			System.out.println("Array Before Sorted : ");
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
		//Selection sort
			
			for(int i =0;i<arr.length-1;i++) {
				int temp = 0;
				int min = arr[i] ;
				int index = i;
				for(int j =i+1;j<arr.length-1-i;j++) {
					if(min>arr[j]) {
						min = arr[j];
						index = j;
					}
				}
				//Logic for Swapping Elements
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
			
		//After Array is Sorted 
			System.out.println("Array After Sorted : ");
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		scan.close();
	}

}
