import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<MatchResult> matchResults;

    public Statistics(String filename) throws FileNotFoundException {
        //TO DO
    }

    public Set<String> getGoalScorers() {
        //does this work ? idk
    Set<String> goalScorers = new HashSet<>(); //makes a empty hashmap to fill with goalScorers
    for (MatchResult matchResult : matchResults) { //for each matchResult in matchResults
        goalScorers.addAll(matchResult.getGoalScorers()); //add all goalScorers from matchResult to goalScorers
        return goalScorers;
    }

    public Map<String, Integer> getGoalScorersWithTotals() {
        //TO DO
            Map<String, Integer> goalScorersWithTotals = new HashMap<>(); //makes a empty hashmap to fill with goalScorers
            for (String goalScorersWithTotals : getGoalScorers()) { //for each matchResult in matchResults
                goalScorersWithTotals.puts(goalScorersWithTotals, )); //add all goalScorers from matchResult to goalScorers
                return goalScorersWithTotals;
    }

    public int getNumberOfGoals(String goalScorers){
        //TO DO
    }
}
