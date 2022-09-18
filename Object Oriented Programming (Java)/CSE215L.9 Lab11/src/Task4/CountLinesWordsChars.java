package Task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountLinesWordsChars {
    public static void main(String[] args) {
//Declaring variables
        int count_lines = 0;
        int count_words = 0;
        int count_characters = 0;


//Creating the Scanner class reference

        Scanner sc = null;

        /*
         * Creating an Scanner class object which is used to get the inputs
         * entered by the user
         */
        Scanner sc1 = new Scanner(System.in);
        String line = null;
        String fname;
        String words[];

        try {
            System.out.print("Enter the input filename :");
            fname = sc1.nextLine();
//Opening the file
            sc = new Scanner(new File(fname));

//This loops continue to execute until the end of the file
            while (sc.hasNext()) {

//Counting the number of lines
                count_lines++;

                line = sc.nextLine();

//This for loop will count no of characters in the file
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ' && line.charAt(i) != '\n') {
//Counting no of characters
                        count_characters++;
                    }
                }

//splitting each line into String array
                words = line.split(" ");
                for (int j = 0; j < words.length; j++) {

//Counting no of words in the file
                    count_words++;
                }

            }
        } catch (IOException e) {
//Displaying the exception
            System.out.println("Exception :" + e);
        }

//Displaying the number of lines in the file
        System.out.println("No of Lines in the File :" + count_lines);

//Displaying the number of words in the file
        System.out.println("No of Words in the File :" + count_words);

//Displaying the number of characters in the file
        System.out.println("No of Characters in the File :" + count_characters);
    }
}