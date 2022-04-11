package com.lab2.practice2;

import java.util.Scanner;

public class Money {
	public static void sort(int denominations[]) {  
		int n=denominations.length;
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(denominations[j-1] > denominations[j]){  
                                 temp = denominations[j-1];  
                                 denominations[j-1] = denominations[j];  
                                 denominations[j] = temp;
                         }        
                 }  
         }
         
	}
 public static void notesCountImplementaion(int denomintions[],int amount) throws ArithematicException {
	 int [] notecounter=new int[denomintions.length];
	 for(int i=0;i<denomintions.length;i++) {
		 if(amount>=denomintions[i]){
			 notecounter[i]=amount/denomintions[i];
			 amount =amount-notecounter[i]*denomintions[i];
		 }
	 }
	 if(amount>0) {
		 System.out.println("Exact amount cannot be given with the highest denomination");
	 }
	 else {
		 System.out.println("Your payment approach in order to give min no of notes will be");
		 for(int i=0;i<denomintions.length;i++) {
			 if (notecounter[i]!=0) {
					System.out.println(denomintions[i]  +  ":"   + notecounter[i]);
				} 
		 }
	 }
 }
	public static void main(String[] args) throws ArithematicException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		int denominations[]=new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++) {
			denominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		sort(denominations);
		notesCountImplementaion(denominations,amount);
	}
	
	
}
