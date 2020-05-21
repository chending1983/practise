package com.cl.elena.cloudclient.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class CloudclientApplicationTest {
    @Autowired
    ServletWebServerApplicationContext server;

    @LocalServerPort
    int port;
    

	@Test
	void testMain() {
//		fail("Not yet implemented");
		System.out.println("server port : " + server.getWebServer().getPort());
		System.out.println("server port Value is :" + port);
	}

	@Test
	void testHelloClient() {
//		fail("Not yet implemented");
	}

	@Test
	void testExitCodeGenerator() {
//		fail("Not yet implemented");
	}

}
