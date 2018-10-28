package boot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.model.Product;
import boot.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Resource
	private ProductService productService;

	@RequestMapping("/save")
	@ResponseBody
	public String save(Product product) {
		productService.save(product);
		return "Hello Boot";
	}
}
