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
        java.util.List<ReghospHsub> result = port.hsubAll("23228");
        Assertions.assertThat(result).isNotEmpty();

    }

}
