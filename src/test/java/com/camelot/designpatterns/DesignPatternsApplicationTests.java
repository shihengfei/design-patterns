package com.camelot.designpatterns;

import com.camelot.designpatterns.observer.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternsApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		userService.register("史恒飞");
	}

}
