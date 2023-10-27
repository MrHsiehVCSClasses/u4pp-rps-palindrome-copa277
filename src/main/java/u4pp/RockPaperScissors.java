package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {
	
    /* any code you need here for part b */

    /**
     * JAVADOC HERE
     */
    public static void play(Scanner sc) {
    	System.out.println("Welcome to Rock Paper Scissors");
    	String internetporn="";
    	int tie=0;
    	int win=0;
    	int lose=0;
    	boolean start = true;
    	boolean rl = true;
    	
    	while(start=true&& !(internetporn.equals("N")||internetporn.equals("n"))) {
        	
    		
    		
    		
    		
    		
    		
    		System.out.println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: ");
 	
        	String a= sc.nextLine().toUpperCase();
        	
        	
        	if(a.equals("A")||a.equals("a")) {
        		a=Random();
        	}
        	

        	while(!(a.equals("R")||a.equals("S")||a.equals("P")||a.equals("A")||a.equals("a"))) {
        		System.out.println("Invalid input, please try again");
        		a=sc.nextLine().toUpperCase();
            	rl=false;
            	start=true;
            	
        	}
        	String b=Random();
        	if(a.equals("A")||a.equals("a")) {
        		a=Random();
        	}
        	int c= results(a,b);
        	if((a.equals("R")||a.equals("S")||a.equals("P")||a.equals("A")||a.equals("a"))) {        	
        	if(c==0) {
        		if( b.equals("R")){
        			System.out.println("You both picked Rock. Its a tie!");
        		}
        	
        		else if( b.equals("S")){
        			System.out.println("You both picked Scissors. Its a tie!");
        		}
        		else if ( b.equals("P")){
        			System.out.println("You both picked Paper. Its a tie!");
        		}
        		tie++;
        		rl=true;
        	}
        	if(c==1) {
            	if ((a.equals("R")) && b.equals ("S")) {
                	System.out.println ("You picked Rock, and the Computer picked Scissors. You win!");
            	}
            	else if ((a.equals("P")) && b.equals ("R")) {
                	System.out.println ("You picked Paper, and the Computer picked Rock. You win!");
            	}
            	else if ((a.equals("S")) && b.equals ("P")) {
                	System.out.println ("You picked Scissors, and the Computer picked Paper. You win!");
            	}
            	win++;
            	rl=true;        				
        	}
        	if(c==-1) {
                if ((a.equals("R")) && b.equals ("P")) {
                	System.out.println ("You picked Rock, and the Computer picked Paper. You lose!");
                 }
                else if ((a.equals("P")) && b.equals ("S")) {
                	System.out.println ("You picked Paper, and the Computer picked Scissors. You lose!");
                 }
                else if ((a.equals("S")) && b.equals ("R")) {
                	System.out.println ("You picked Scissors, and the Computer picked Rock. You lose!");
                 }
                lose++;
        		rl=true;
        	}
        	System.out.println("You have "+win+" wins and "+lose+" losses and "+tie+" ties");
        	
        	
        	while (rl) {
        	System.out.println("Would you like to play again? (Y)es or (N)o:");
        	internetporn=sc.nextLine().toUpperCase();
        	
        	
        	if(internetporn.equals("N")||internetporn.equals("n")) {
    		System.out.println("Thanks for playing! ");
    		start=false;
    		rl=false;
        	}
        	else if(internetporn.equals("Y")) {
        		start = true;
        		rl= false;
        	}
        	else if(!internetporn.equals("Y")||!internetporn.equals("Y")) {
        		internetporn=sc.nextLine().toUpperCase();
        	}
        	
        	
        	
        	
        	
        	
        	
        	}
        	}
    	}
    	
        		
        
        	
    		
  

    	
        /* PART B: YOUR CODE HERE */
    }

    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
    	playerChoice.toUpperCase();
    	computerChoice.toUpperCase();
    	if((playerChoice.equals("P"))&&(computerChoice.equals("R"))) {
    		return 1;
    		
    }
    	if((playerChoice.equals("S"))&&(computerChoice.equals("R"))) {
    		return 1;
    		
    }
    	if((playerChoice.equals("R"))&&(computerChoice.equals("S"))) {
    		return 1;
    		
    }
    	if((playerChoice.equals("R"))&&(computerChoice.equals("P"))) {
    		return -1;
    		
    }
    	if((playerChoice.equals("S"))&&(computerChoice.equals("R"))) {
    		return -1;
    		
    }
    	if((playerChoice.equals("P"))&&(computerChoice.equals("S"))) {
    		return -1;
    		
    }
    	if((playerChoice.equals("P"))&&(computerChoice.equals("P"))) {
    		return 0;
    		
    }
    	if((playerChoice.equals("R"))&&(computerChoice.equals("R"))) {
    		return 0;
    	}
    	if((playerChoice.equals("S"))&&(computerChoice.equals("S"))) {
    		return 0;
    		
    }



    	return 1;
    	
        /* PART A: YOUR CODE HERE */
    }
    
    
    public static String Random () {
    	int poop= (int)(Math.random()*3)+1;
    	if(poop==1) {
    		return "R";
    	}
    	else if(poop==2 ) {
    		return "S";
    	}
    	else if(poop==3) {
    		return "P";
    	}
    	else return null;
    	
    }
    

    /* 
     * create helper methods for part b
     * I recommend at least making a helper method that returns a random option between "r", "p", and "s"
     */
}