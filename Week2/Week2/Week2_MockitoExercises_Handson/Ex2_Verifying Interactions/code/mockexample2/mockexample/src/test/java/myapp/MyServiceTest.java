package myapp;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Use service
        MyService service = new MyService(mockApi);
        service.fetchData(); // this internally calls mockApi.getData()

        // Step 3: Verify interaction
        verify(mockApi).getData(); // Verifies getData() was called exactly once
    }
}
