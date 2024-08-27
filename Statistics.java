import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    }

    public int getNumberOfGoals(String goalScorer){
        //TO DO
    }
}
