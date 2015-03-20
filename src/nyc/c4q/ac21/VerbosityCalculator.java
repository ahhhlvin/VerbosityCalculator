package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {
    public static void main(String[] args) {

        File TheProjectGutenberg = new File("/Users/alvin2/desktop/accesscode/VerbosityCalculator/resources/TheProjectGutenberg.rtf");
        File ATaleofTwoCities = new File("/Users/alvin2/desktop/accesscode/VerbosityCalculator/resources/ATaleOfTwoCities.rtf");

        System.out.println("The Project Gutenberg -- ");
        verbCalculator(TheProjectGutenberg);


        System.out.println("A Tale of Two Cities -- ");
        verbCalculator(ATaleofTwoCities);


    }


    public static void verbCalculator(File file){

        // An abstract representation of a File
        File text = new File("PATH to text file");

        try{
            Scanner sc = new Scanner(file);

            String textFile;
            int words = 0;
            int sentences = 0;
            double verbosity;


            while (sc.hasNext()) {
                textFile = sc.next();

                words ++;

                if ((textFile.equals("Dr.")) || (textFile.equals("Ms.")) || (textFile.equals("Mrs.")) || (textFile.equals("Mr."))) {
                    continue;
                } else if ( (textFile.contains(".")) || (textFile.contains("?")) || (textFile.contains("!")) ) {
                    sentences++;
                }


                verbosity = words/(double)sentences;

                
                System.out.println(verbosity);


            }




        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
