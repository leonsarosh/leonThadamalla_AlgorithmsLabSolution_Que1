package com.greatlearning.algorithmlabsolution1.TransactionService;

import java.util.Scanner;

public class TransactionServiceClass {
	
	public int evaluateTargetSearch(int arr[], int low, int high, int target) {
		if(arr[arr.length-1]<target) {
			return -1;
		}
		if(arr[0]>=target) {
			return 1;
		}
		if(low>high) {
			return -1;
		}
		int mid= (low+high)/2;
		if (target<=arr[mid]) {
			if (target>arr[mid-1]) {
				return mid+1;
			} else {
				return evaluateTargetSearch(arr,mid-1,high,target);
			}
		} else {
			return evaluateTargetSearch(arr,mid+1,high,target);
		}
	}
	
	public int[] arrayInput(int size) {
		Scanner sc1=new Scanner(System.in);
		
		int arr[]=new int[size];
		
		for (int i=0; i<size; i++) {
			if(sc1.hasNextInt()) {
				arr[i]=sc1.nextInt();
			} else {
				System.out.println("Please enter positive integer values only. Enter all values again.");
				return arrayInput(size);
			}
		}
		
		for (int i=0; i<size; i++) {
			if (arr[i]<0) {
				System.out.println("Please enter positive integer values only. Enter all values again.");
				return arrayInput(size);
			}
		}
		
		return arr;
	}
	
	public int checkInt() {
		Scanner sc2=new Scanner(System.in);
		
		while (!sc2.hasNextInt()) {
			System.out.println("Please enter a positive integer value only. Try again.");
			return checkInt();
		}
		
		int input1=sc2.nextInt();
		
		while (input1<0) {
			System.out.println("Please enter a positive integer value only. Try again.");
			return checkInt();
		}
		
		return input1;
	}
}

