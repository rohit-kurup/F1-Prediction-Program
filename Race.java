public class Race{
    // Attributes of the class 
    private String name;
    private int laps;
    private double lapLength; // in kilometers
    private String location;
    private String weatherCondition;
    private String date;
    private String typeOfRace;
    private Boolean isSprintRace;
    private Boolean isNightRace;

    // Constructors for the class 
    public Race(
        String name, 
        int laps, 
        int lapLength, 
        String location, 
        String weatherCondition, 
        String date, 
        String typeOfRace, 
        Boolean isSprintRace, 
        Boolean isNightRace){
                
            this.name = name;
            this.laps = laps;
            this.lapLength = lapLength;
            this.location = location;
            this.weatherCondition = weatherCondition;
            this.date = date;
            this.typeOfRace = typeOfRace;
        }
    

    public Race(String name, int laps, double lapLength, String location){
        this.name = name;
        this.laps = laps;
        this.lapLength = lapLength;
        this.location = location;
        this.weatherCondition = "Sunny";
        this.date = "2021-09-05";
        this.typeOfRace = "Grand Prix";
        this.isSprintRace = false;
        this.isNightRace = false;
    }

    public Race(){
        this.name = "Race";
        this.laps = 71;
        this.lapLength = 4.326;
        this.location = "Austria";
        this.weatherCondition = "Sunny";
        this.date = "2021-09-05";
        this.typeOfRace = "Grand Prix";
        this.isSprintRace = false;
        this.isNightRace = false;
    }

    // Getters and Setters for the class
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public double getLapLength() {
        return lapLength;
    }

    public void setLapLength(double lapLength) {
        this.lapLength = lapLength;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeOfRace() {
        return typeOfRace;
    }

    public void setTypeOfRace(String typeOfRace) {
        this.typeOfRace = typeOfRace;
    }

    public Boolean getIsSprintRace() {
        return isSprintRace;
    }

    public void setIsSprintRace(Boolean isSprintRace) {
        this.isSprintRace = isSprintRace;
    }

    public Boolean getIsNightRace() {
        return isNightRace;
    }

    public void setIsNightRace(Boolean isNightRace) {
        this.isNightRace = isNightRace;
    }

    public String toString(){
        String output;
        return (
            "name: " + name + "\n" +
            "laps: " + laps + "\n" +
            "lapLength: " + lapLength + "\n" +
            "location: " + location + "\n" +
            "weatherCondition: " + weatherCondition + "\n" +                
            "date: " + date + "\n" +
            "typeOfRace: " + typeOfRace + "\n" +
            "isSprintRace: " + isSprintRace + "\n" +
            "isNightRace: " + isNightRace + "\n"
        );
        
    }




}