package com.greatlearning.algorithmlabsolution1.DriverPackage;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.algorithmlabsolution1.TransactionService.TransactionServiceClass;

public class MainDriverClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TransactionServiceClass transaction1= new TransactionServiceClass();
		
		System.out.println("Enter the size of transaction array");
		int size=transaction1.checkInt();
		
		int transactionArr[]=new int[size];
		int cummulativeSumArr[]=new int[size];
		
		System.out.println("Enter the values of array");

		transactionArr=transaction1.arrayInput(size);
		
		for (int i=0; i<transactionArr.length; i++) {
			if(i==0) {
				cummulativeSumArr[i]=transactionArr[i];
			} else {
				cummulativeSumArr[i]=cummulativeSumArr[i-1]+transactionArr[i];
			}
		}

		System.out.println("Enter the total no of targets that need to be achieved");
		int numberOfTargets=transaction1.checkInt();
		
		for (int i=1; i<=numberOfTargets; i++) {
			System.out.println("Enter the value of target");
			int target=transaction1.checkInt();
			int targetTransaction=transaction1.evaluateTargetSearch(cummulativeSumArr,0,cummulativeSumArr.length-1,target);
			System.out.println(targetTransaction<0? "Given target is not achieved":"Target achieved after "+targetTransaction+" transactions");
		}
	}

}
