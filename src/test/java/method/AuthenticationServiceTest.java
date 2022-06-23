package method;

import com.pduda.method.AuthenticationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthenticationServiceTest {

    @Test
    void administratorIsAlwaysAuthenticated() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        Assertions.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    void normalUserIsNotAuthenticatedInitially() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assertions.assertFalse(service.isAuthenticated(normalUserId));
    }

}
