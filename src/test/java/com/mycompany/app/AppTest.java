package com.mycompany.app;

import org.junit.jupiter.api.Test;

class AppTest {

   @Test
    void adminUserGetsAccess() {
    assertEquals("Access granted", App.checkUser("admin"));
}

}
