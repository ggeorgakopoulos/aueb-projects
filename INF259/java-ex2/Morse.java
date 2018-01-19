import acm.program.*; //import acm

public class Morse extends Program { 
    public void run() {
        println("This is an English to Morse converter. Created by George Georgakopoulos (https://georgkapoulos.me).");
        String text = readLine("Enter string to convert: ").toUpperCase(); //Convert string to uppercase
        

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Entire alphabet in a string (in order to be able to use indexOf later on)
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-",  ".-.", "...", "-", "..-", "...-" ,".--" ,"-..-", "-.--", "--.."}; //Morse code in alphabetical order

        for(int i = 0; i <= text.length() - 1; i++){ //This for loop is used to do checks for each character

            int index = alphabet.indexOf(text.charAt(i));

            if (index != -1 ) {
                print(morse[index]);
            } else if (text.charAt(i) == ' ') {
                println();
            } else {
                print(text.charAt(i));
            }
        }
    }
}

