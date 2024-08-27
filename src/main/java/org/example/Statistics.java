package src;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Statistics {

    private List<MatchResult> matchResults;

    public Statistics(String filename) throws FileNotFoundException {
        //constructor
        //TO DO
    }

    public Set<String> getGoalScorers() {
        //set som har alle goalScorers
        //TO DO
    }

    public Map<String, Integer> getGoalScorersWithTotals() {
        //returner map med spillere som keys og deres mål som værdi.
        //TO DO
    }

    public int getNumberOfGoals(String goalScorer){
        //TO DO
        //hvor mange mål, en specifik spiller har scoret.
    }
}
