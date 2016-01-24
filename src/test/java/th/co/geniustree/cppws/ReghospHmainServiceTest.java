package th.co.geniustree.cppws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pramoth
 */
public class ReghospHmainServiceTest {
    
    public ReghospHmainServiceTest() {
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
            ReghospHmainService_Service service = new ReghospHmainService_Service();
            ReghospHmainService port = service.getReghospHmainServicePort();
            // TODO initialize WS operation arguments here
            int page = 0;
            int size = 0;
            // TODO process result here
            java.util.List<ReghospHmain> result = port.hmainAll(page, size);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
