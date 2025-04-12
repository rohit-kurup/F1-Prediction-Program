// import Race; // Removed as it is unnecessary if Race is in the same package


public class Runner{
    public static void main(String[] args) {
        Race race1 = new Race();
        Race race2 = new Race("Shanghai Race", 30, 25.3, "Shanghai" );
        System.out.println(race1.toString());
        System.out.println(race2.toString());   

        
    }
}

