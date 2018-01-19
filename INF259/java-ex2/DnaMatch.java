import acm.program.*;  //Importing ACM

public class DnaMatch extends DialogProgram {

    private String findFirstMatchingPosition(String shortDNA, String longDNA) {

        if (shortDNA.length() > longDNA.length()) {
            return "The short DNA sequence has to always be smaller than the long DNA sequence"; //Error message if short DNA > long DNA
        }

        String reversedShortDNA = ""; //this string will be used to store the shortDNA's sequence match on the long DNA (if it exists)

        for (int i = 0; i <= shortDNA.length() - 1; i++) {  //This for loop is used to generate the shortDNA's sequence match on the longDNA
            switch(shortDNA.charAt(i)) {
                case 'A' :
                    reversedShortDNA += "T";
                break;
                
                case 'T' :
                    reversedShortDNA += "A";
                break;

                case 'C' :
                    reversedShortDNA += "G";
                break;

                default :
                    reversedShortDNA += "C";
            }

            //Switch is used instead of if, because there are four cases that need to be tested.
        }
        return "We found a match, that starts in the position: " + String.valueOf(longDNA.indexOf(reversedShortDNA)) + ", of the long DNA sequence"; //IndexOf is being used to determine the starting position of the matching DNA sequence
    }
    public void run(){
        println("This Application finds the first matching position for two DNA sequences. Created by George Georgakopoulos (https://georgakopoulos.me)");
        String shortDNA = readLine("Enter the short DNA sequence: ").toUpperCase();
        String longDNA = readLine("Enter the long DNA sequence: ").toUpperCase();  //User input is converted to uppercase

        println( findFirstMatchingPosition(shortDNA, longDNA)); //Print out the result of the function
    }   
}