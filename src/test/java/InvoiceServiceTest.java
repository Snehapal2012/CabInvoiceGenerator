import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class InvoiceServiceTest {
    private Assertions Assert;
    InvoiceGenerator invoiceGenerator=null;
    @BeforeEach
    public void setUp() throws Exception{
         invoiceGenerator=new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        double distance=2.0; //distance i kilometers
        int time=5;  // time in minutes
        double fare=invoiceGenerator.calculateFare(distance,time); //total fare calculations
        Assert.assertEquals(25,fare,0.0);

    }
    @Test
    public void givenLessDistanceOrTime_shouldReturnMinFare(){

        double distance=0.1; //distance i kilometers
        int time=1;  // time in minutes
        double fare=invoiceGenerator.calculateFare(distance,time); //total fare calculations
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        Ride[] rides= {new Ride(2.0, 5),  //for multiple rides
              new Ride(0.1, 1)
      };
      InvoiceSummary summary=invoiceGenerator.calculateFare(rides);
      InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,30.0);
      Assert.assertEquals(expectedInvoiceSummary,summary);
    }
}
