package es.jripoll.ioc.classpathxml;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocClassPathXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpathxmlapplicationcontext-example.xml"
		);

		Product product = (Product) context.getBean("product");
		System.out.println("### A Product ###");
		System.out.println("SKU: " + product.getSku());
		System.out.println("Name: " + product.getName());
		System.out.println("Stock: " + product.getStock());

		Product sameProduct = context.getBean("product", Product.class);
		System.out.println("### Same Product ###");
		System.out.println("SKU: " + sameProduct.getSku());
		System.out.println("Name: " + sameProduct.getName());
		System.out.println("Stock: " + sameProduct.getStock());
	}
}
