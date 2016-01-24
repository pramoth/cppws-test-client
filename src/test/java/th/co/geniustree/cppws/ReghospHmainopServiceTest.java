package th.co.geniustree.cppws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pramoth
 */
public class ReghospHmainopServiceTest {
    
    public ReghospHmainopServiceTest() {
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
            ReghospHmainopService_Service service = new ReghospHmainopService_Service();
            ReghospHmainopService port = service.getReghospHmainopServicePort();
            // TODO initialize WS operation arguments here
            int page = 0;
            int size = 0;
            // TODO process result here
            java.util.List<ReghospHmainop> result = port.hmainOpAll(page, size);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
