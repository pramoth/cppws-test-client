package th.co.geniustree.cppws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pramoth
 */
public class ReghospHsubServiceTest {

    public ReghospHsubServiceTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCall() throws Exception {

        ReghospHsubService_Service service = new ReghospHsubService_Service();
        ReghospHsubService port = service.getReghospHsubServicePort();
        // TODO initialize WS operation arguments here
        int page = 0;
        int size = 10;
        // TODO process result here
        java.util.List<ReghospHsub> result = port.hsubAll(page, size);
        System.out.println("Result = " + result);

    }

}
