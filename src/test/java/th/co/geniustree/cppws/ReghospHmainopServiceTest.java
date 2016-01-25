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
            java.util.List<ReghospHmainop> result = port.hmainOpAll("02518");
            Assertions.assertThat(result).isNotEmpty();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
