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
}
