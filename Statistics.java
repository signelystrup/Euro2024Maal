import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Statistics {
    public static void main (String[] args) throws FileNotFoundException {
        MatchResultFileReader m = new MatchResultFileReader("Euro2024QualifyingRound.csv");
        System.out.println(m.readFile());
    }
    private List<MatchResult> matchResults;

    public Statistics(String filename) throws FileNotFoundException {
        //constructor
        //TO DO
    }

    public Set<String> getGoalScorers() {
        //set som har alle goalScorers
        //TO DO
        return null;
    }

    public Map<String, Integer> getGoalScorersWithTotals() {
        //returner map med spillere som keys og deres mål som værdi.
        //TO DO
        return null;
    }

    public int getNumberOfGoals(String goalScorer){
        //TO DO
        //hvor mange mål, en specifik spiller har scoret.
        return 0;
    }
}
