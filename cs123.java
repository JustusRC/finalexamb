package final_exam_b;

import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//Variable declaration	
        int space = 0, digit=0, letter = 0 ;
		String str; 

		Scanner pam = new Scanner(System.in);
		//Prompts user to enter a sentence
		System.out.print("Enter a single sentence: ");
		str=pam.nextLine();
		//Extracts characters
		char ch=str.charAt(4);
		  
		//if-else to look at the spaces, letters, and digits
		  if (Character.isWhitespace(ch))
		  {
			  System.out.print("The 5th indexed character is a white space");
			  space++;
			
		  }
		  else if (Character.isLetter(ch))
		  {
			  System.out.print("The 5th indexed character is a letter");
			
			  letter++;
		  }
		  else if (Character.isDigit(ch))
		  {
			  System.out.print("The 5th indexed character is a digit");
			  digit++;
		  }
	

            //Gets the number of words
			int words=str.split(" ").length;
		   
		  //Output for number of words
		  System.out.println("\nNumber of words: "+words);
		  
		  
		  
		
	}

}
