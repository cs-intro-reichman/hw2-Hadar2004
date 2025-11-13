//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String word = args[0];
        int value = Integer.parseInt(args[1]);
        int wordLength = word.length(); // פונקציה שמחזירה את מס התווים במחרוזת
        word = word.toUpperCase(); // הפונקציה תחזיר את כל הערכים של המילה באותיות גדולות
        final String AN_LETTERS = "AEFHILMNORSX";
        
        
        for (int i = 0; i < wordLength; i++) {
        char current_char = word.charAt(i);
        
        if (AN_LETTERS.indexOf(current_char) != -1) {
       System.out.println("Give me an " + current_char + ": " + current_char + "!");
        }
        else {
        System.out.println("Give me a  " + current_char + ": " + current_char + "!");        
        }
        
        
        }
        System.out.println("What does that spell?"); 

         for (int x = 0; x < value; x++) {
         System.out.println(word + "!!!");  
        }
        }
}
