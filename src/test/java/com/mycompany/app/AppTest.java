package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

   @Test
    void adminUserGetsAccess() {
    assertEquals("Access granted", App.checkUser("admin"));
}

@Test
void normalUserGetsDenied() {
    assertEquals("Access denied", App.checkUser("john"));
}

}
