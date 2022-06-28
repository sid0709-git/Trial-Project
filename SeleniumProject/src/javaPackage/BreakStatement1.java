package javaPackage;


public class BreakStatement1 {                             //The break statement can also be used to jump out of a loop.

	public static void main(String[] args) {
		
		for(int i = 0; i <10; i++) {
			
			if(i==5) {
				  break;                                 // This example stops the loop, when i is equal to 5:
				
				//continue; 
				}                                    
			System.out.println(i);
				
			}
		}

	}

//The continue statement breaks one iteration (in the loop), if a specified condition occurs, 
//and continues with the next iteration in the loop.This example skips the value of 5		
