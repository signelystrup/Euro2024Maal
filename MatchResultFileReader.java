import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class MatchResultFileReader {

    File file;
    Scanner scanner;

    //opret filobjekt
    //læse fil
    //tilføj målscorere til liste (readFile())
//TO DO

    public MatchResultFileReader(String fileName) throws
            FileNotFoundException {
        //TO DO
        file = new File(fileName);
        scanner = new Scanner(file);
    }

    public List<MatchResult> readFile() {
        List<MatchResult> matchResults = new ArrayList<>(); //list of all MatchResults.
        //TO DO
        //mens der er ulæst linjer i filen:
        //indlæs en linje i filen
        //parse dataen og opret et MatchResult objekt
        // hvis ikke der er nogle målscorere skal listen af målscorere være tom
        // ellers skal listen af målscorere indeholde navnet for hver mål scoret

        while(scanner.hasNext()){
            String csvString; //contains 1 line from csv file
            String teams;
            List <String> goalScorers = new ArrayList<>(); //names of goalScorers. ex: højlund, højlund, højlund.
            //goalScorers.add("hej");
            csvString = scanner.nextLine();
            int subStringStart = csvString.indexOf(";") - 1; //
            teams = csvString.substring(0, subStringStart);

            subStringStart +=2;

            while(csvString.contains(",")){
                int subStringEnd = csvString.indexOf(",");
                goalScorers.add(csvString.substring(subStringStart, subStringEnd));
                subStringStart = subStringEnd + 1;
            }

            MatchResult mr = new MatchResult(teams,goalScorers);//String teams, List<String> goalscorers
        }
        return matchResults;
    }

    public void chopUpCSV(String csv){
        //csv.
    }

}
