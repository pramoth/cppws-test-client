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
            java.util.List<ReghospHjoin> result = port.hjoinAll("24976");
            Assertions.assertThat(result).isNotEmpty();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    
}
