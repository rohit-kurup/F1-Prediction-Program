import java.util.Map;

public class Driver {
    private String name;
    private String team;
    private int ranking;
    private Map<String, Double> performanceInConditions;

    public Driver(String name, String team, int ranking, Map<String, Double> performanceInConditions) {
        this.name = name;
        this.team = team;
        this.ranking = ranking;
        this.performanceInConditions = performanceInConditions;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getRanking() {
        return ranking;
    }

    public Map<String, Double> getPerformanceInConditions() {
        return performanceInConditions;
    }

    @Override
    public String toString() {
        return name + " - " + team + " [Rank: " + ranking + "]";
    }
}