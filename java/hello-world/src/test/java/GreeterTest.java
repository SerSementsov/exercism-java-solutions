import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

    @Test
    public void myTest(){
        String message = "GAPI-88803,No data found in TCAM_SVINVOICENUMRANGE table for the given p_inputInvSeqNum 1, Office Code 2 , Punto Venta Code ,3 , Invoice Num Range Type Id 4 where Status = 1 or Office Code 2 is Missing from table TCAM_OFFICEINFO ;1,8031,414,1";


    }

}
