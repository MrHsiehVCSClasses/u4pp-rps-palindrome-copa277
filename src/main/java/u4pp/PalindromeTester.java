package u4pp;
/**
* YOUR COMMENTS HEREthis si the my proejct with both fo the thigns nwo and they whould work hee going to work on mkaing sure that it is sfliippable thorugh the reverse and comparing the string and then compare each and eery letter for punctuation 
*/
import java.util.Scanner;

public class PalindromeTester {
    /** 
     * YOUR JAVADOC HERE here is oign to be the wring and such 
     */ 
    public static void execute(Scanner sc) {
        /* YOUR CODE HERE */
    	String pee="";
    	System.out.println("Welcome to Palindrome Tester");
    	while(!pee.equals("N")) {
    	System.out.println("Enter a phrase: ");
    	
    	String rat= sc.nextLine();
    	String nipple=rat.toUpperCase();
    	String apple="";
    	for(int i=0;i<nipple.length();i++) {
    		if(nipple.substring(i,i+1).equals("A")||nipple.substring(i,i+1).equals("B")||nipple.substring(i,i+1).equals("C")||nipple.substring(i,i+1).equals("D")||nipple.substring(i,i+1).equals("E")||nipple.substring(i,i+1).equals("F")||nipple.substring(i,i+1).equals("G")||nipple.substring(i,i+1).equals("H")||nipple.substring(i,i+1).equals("I")||nipple.substring(i,i+1).equals("J")||nipple.substring(i,i+1).equals("K")||nipple.substring(i,i+1).equals("L")||nipple.substring(i,i+1).equals("M")||nipple.substring(i,i+1).equals("N")||nipple.substring(i,i+1).equals("O")||nipple.substring(i,i+1).equals("P")||nipple.substring(i,i+1).equals("Q")||nipple.substring(i,i+1).equals("R")||nipple.substring(i,i+1).equals("S")||nipple.substring(i,i+1).equals("T")||nipple.substring(i,i+1).equals("U")||nipple.substring(i,i+1).equals("V")||nipple.substring(i,i+1).equals("W")||nipple.substring(i,i+1).equals("X")||nipple.substring(i,i+1).equals("Y")||nipple.substring(i,i+1).equals("Z")) {
    			apple+=nipple.substring(i,i+1);
    		}
    		else {
    			apple=apple;
    		}
    	}
    	if(isPalindrome(apple)==true) {
    		System.out.println(rat+ " is a palindrome");
    	}
    	else {
    		System.out.println(rat + " is not a palindrome");
    	}
    	System.out.println("Keep testing? (Y)es or (N)o: ");
    	pee=sc.nextLine().toUpperCase();
    	if((!pee.equals("Y"))&&((!pee.equals("N")))){
    		System.out.println("Invalid Input, please try again");
    		pee=sc.nextLine();
    	}
    	
    	}
    	
    	}
 
    		
    		
  
    	

    	
    		

 
 
    
    
    
    
    

    /**
     * YOUR JAVADOC HERE  my acutal way to chekc for palindome 
     */
    public static boolean isPalindrome(String phrase) {
    	String reverse="";
    	for(int i=phrase.length()-1;i>=0;i--) {
    		reverse+= phrase.substring(i,i+1);
    	}
    	
    	
    	
    	if(!phrase.toUpperCase().equals(reverse.toUpperCase())) {
    			return false;
    			
    			
    	}
    			
    	return true; 
        /* YOUR CODE HERE */
    }


    /* Any helper methods you might need */
}