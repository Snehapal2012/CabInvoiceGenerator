public class InvoiceGenerator {
    private static final int COST_PER_TIME=1; //minimum cost per time
    private static final double MINIMUM_COST_PER_KILOMETER=10;   //minimum cost per distance
    private static final double MINIMUM_FARE=5;
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME; //total fare calculation
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

    public InvoiceSummary calculateFare(Ride[] rides) {     //calculate total fare for multiple rides
        double totalFare=0;
        for (Ride ride:rides){
            totalFare+=this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length,totalFare);
    }
}
