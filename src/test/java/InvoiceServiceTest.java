import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class InvoiceServiceTest {
    private Assertions Assert;

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0; //distance i kilometers
        int time=5;  // time in minutes
        double fare=invoiceGenerator.calculateFare(distance,time); //total fare calculations
        Assert.assertEquals(25,fare,0.0);

    }
    @Test
    public void givenLessDistanceOrTime_shouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=0.1; //distance i kilometers
        int time=1;  // time in minutes
        double fare=invoiceGenerator.calculateFare(distance,time); //total fare calculations
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
      InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
      Ride[] rides= {new Ride(2.0, 5),
              new Ride(0.1, 1)
      };
      double fare=invoiceGenerator.calculateFare(rides);
      Assert.assertEquals(30,fare,0.0);
    }
}
