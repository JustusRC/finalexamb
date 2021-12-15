package final_exam_a;

import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//Variable declaration	
		int hour, minute, second = 0 ;
		int minute2hour = 60; 
		
		Scanner pam = new Scanner (System.in);
		//Prompts use for total minutes
		System.out.print("Enter the total number of minutes: ");
		minute = pam.nextInt();
		//Divides total minutes to get number of hours
		minute2hour = minute / 60;
		//Module to get number of minute
		minute = minute % 60;
		//For loop to get a random number between 15 - 45
		for (int i = 0; i<=5; i++)
		{
			second = (int)(Math.random()*45)+15;
		}
        
	
		//Output
		System.out.printf("The total number of time is: "+minute2hour+" hour, " +minute+" minutes, " +second+" seconds.");
		
		
		
		
		
		
		
	}

}
