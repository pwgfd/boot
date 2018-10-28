package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
@SpringBootApplication // 代表项目入口
public class ProductController {

	@RequestMapping
	@ResponseBody
	public String save() {
		return "Hello Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductController.class, args);
	}

}
