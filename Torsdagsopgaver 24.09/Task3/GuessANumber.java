            import java.util.Random;
            import java.util.Scanner;  

            public class GuessANumber {
                private static int rnd_number;
                private static int inputCounter=0;
            	
                public static void main(String[] args) {
                    // pick a random number
                    Random random = new Random();
                    rnd_number = random.nextInt(100) + 1;
                    System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
            	    System.out.println( "Can you guess what it is?...");
                    makeAGuess();

                }


                private static void makeAGuess(){
                    Scanner scan=new Scanner(System.in);
                    inputCounter++;
                    if(scan.hasNextInt()){
                    int input = scan.nextInt(); //User input.
                     System.out.println(rnd_number);
                    if(input==rnd_number){
                        System.out.println("Your guess was correct! It took you: "+ inputCounter + " tries to get here!");

                                return;   
                                   }
                        else if(input<rnd_number){
                            System.out.println("Incorrect! Try a higher number!");
                        }
                         else if(input>rnd_number){
                            System.out.println("Incorrect! Try a lower number!");
                    }
                        }
                else{
                        System.out.println("Please only enter numbers!");

     }
                 makeAGuess();
            }
            }
                    
            	// Create a Scanner object   	 
                    // use hasNextDouble to check if input is numeric, 
                    // if so...
            	// Read user input
                    // Compare it with the random number
                    // Let the user know the result of the comparison
                    // Let the user try again by calling this method recursively
                    // Help the user by revealing wether the guess was lower or higher than the target number
                    // if input was not numeric show an error message and call this method recursively
