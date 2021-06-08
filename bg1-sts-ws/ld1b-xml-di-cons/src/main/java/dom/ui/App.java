package dom.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dom.repository.ProductRepositoryImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Starter Enterprise App Setup");
//		tradionalWay();
		/*
		 * Central interface to provide configuration for an application. This is
		 * read-only while the application is running ApplicationContext
		 */
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); ProductRepository
		 * productRepository = (ProductRepository)
		 * applicationContext.getBean("productRepository");
		 * productRepository.findAll().forEach(System.out::println);
		 * ((ClassPathXmlApplicationContext) applicationContext).close();
		 */

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
//		The traditional way
//		ProductRepository productRepository = (ProductRepository) applicationContext.getBean("productRepository");
//		The spring way
		ProductRepositoryImpl productRepository = applicationContext.getBean("productRepository",
				ProductRepositoryImpl.class);
		productRepository.findAll().forEach(System.out::println);
		applicationContext.close();
	}

	private static void tradionalWay() {
//		ProductRepository productRepository = new ProductRepositoryImpl();
//		List<Product> products = productRepository.findAll();
//		System.out.println(products);
// oldest method
//		for (int i = 0; i < products.size(); i++) {
//			System.out.println(products.get(i));
//		}
//		enhanced for loop
		/*
		 * for (Product product : products) { System.out.println(product); }
		 */
// java 8 way with lambda
//		products.forEach((product) -> System.out.println(product));
		// java 8 way with method references
//		products.forEach(System.out::println);
	}
}