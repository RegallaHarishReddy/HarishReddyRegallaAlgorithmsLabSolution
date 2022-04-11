package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n=sc.nextInt();
		int arry[]=new int[n];
		System.out.println("enter the value of array");
		for(int i=0;i<n;i++) {
			arry[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int nooftargets=sc.nextInt();for(int t=1;t<=nooftargets;t++)
		{
		System.out.println("Enter the value of the target");
		int i;
		int target=sc.nextInt();
		
		int sum=0;
		for(i=0;i<n;i++) {
			 sum=sum+arry[i];	
				if(sum>=target) {
				//System.out.println(arry[i]);
				break;
				}
		}
			if(sum<target) {
				System.out.println("Given target is not achieved");
			}
			else {
				System.out.println("Target achieved after "+(i+1)+" transactions");
			}
	}
	}

}
