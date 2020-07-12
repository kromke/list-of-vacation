package org.test.listofvacation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "file:./config/application.yml")
class ListOfVacationApplicationTests {

	@Test
	void contextLoads() {
	}

}


