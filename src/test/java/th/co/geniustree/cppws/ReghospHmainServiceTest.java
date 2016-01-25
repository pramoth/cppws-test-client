package th.co.geniustree.cppws;

import org.assertj.core.api.Assertions;
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
            
            java.util.List<ReghospHmain> result = port.hmainAll("11592");
            Assertions.assertThat(result).isNotEmpty();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
