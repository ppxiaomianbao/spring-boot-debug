package com.example.demo;

import com.example.demo.limx.LimxController;
import com.example.demo.test1.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author limx
 */
@SpringBootApplication(
		//此属性是配置要扫描的包,注意，针对的是加上了@Controller、@Service、@Repository、@Configuration
		scanBasePackages = {"com.example.demo.limx"}, exclude = FreeMarkerAutoConfiguration.class)
public class DemoApplication implements ApplicationRunner {
	@Autowired(required = false)
	private TestController testController;
	@Autowired(required = false)
	private LimxController limxController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(testController);
		System.out.println(limxController);
	}
}
