package com.example.demo;

import com.limx.entity.Simple;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {
	@Autowired(required = false)
	private Simple simple;

	@Test
	void contextLoads() {
		System.out.println(simple);
	}

}
