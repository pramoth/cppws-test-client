package th.co.geniustree.cppws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pramoth
 */
public class ReghospHjoinServiceTest {
    
    public ReghospHjoinServiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void testCall() throws Exception {
        
        try { // Call Web Service Operation
            ReghospHjoinService_Service service = new ReghospHjoinService_Service();
            ReghospHjoinService port = service.getReghospHjoinServicePort();
            // TODO initialize WS operation arguments here
            int page = 0;
            int size = 1;
            // TODO process result here
            java.util.List<ReghospHjoin> result = port.hjoinAll(page, size);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    
}
