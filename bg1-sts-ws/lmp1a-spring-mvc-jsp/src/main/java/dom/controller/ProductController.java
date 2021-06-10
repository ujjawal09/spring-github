package dom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//	Product product = (Product) applicationContext.getBean("product");
//	ProductRepository productRepository = (ProductRepository)applicationContext.getBean("productRepository");
//	
	@GetMapping
	public String getAllProducts() {
		return "index";
	}

}
