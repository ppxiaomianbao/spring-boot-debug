package com.example.demo;

import com.example.demo.limx.LimxController;
import com.example.demo.test1.TestController;
import com.limx.annotation.EnableRegisterServer;
import com.limx.entity.Simple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author limx
 */
@SpringBootApplication(
		//此属性是配置要扫描的包,注意，针对的是加上了@Controller、@Service、@Repository、@Configuration
		scanBasePackages = {"com.example.demo.limx"}, exclude = FreeMarkerAutoConfiguration.class)
//@EnableRegisterServer
@RestController
public class DemoApplication implements ApplicationRunner {
	@Autowired(required = false)
	private TestController testController;
	@Autowired(required = false)
	private LimxController limxController;

	/**测试自定义starter*/
	@Autowired(required = false)
	private Simple simple;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("testController: " + testController);
		System.out.println("limxController: " + limxController);
		System.out.println("测试自定义starter ===> simple: " + simple);
	}


	@GetMapping("/test")
	public String test(){
		return "你好，SpringBoot";
	}

}
