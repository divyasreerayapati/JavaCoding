package Sortings;

import java.util.Scanner;

public class InsertionSort {

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
			
			//Array sorting
				for(int i =1;i<arr.length;i++)
				{
					int temp = arr[i];
					int j = i-1;
					while(j>=0&&arr[j]>temp) {
						arr[j+1] = arr[j] ;
						j--;
					}
					arr[j+1] = temp;
					}
			//After Array is Sorted 
				System.out.println("Array After Sorted : ");
				for(int i =0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				
				scan.close();
				
		}
			
		
}

