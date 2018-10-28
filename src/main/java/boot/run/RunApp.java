package boot.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//代表项目入口,配置文件加载都写在此处(boot不推荐xml)
@SpringBootApplication(scanBasePackages = { "boot.*" })
public class RunApp {

	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}

}
