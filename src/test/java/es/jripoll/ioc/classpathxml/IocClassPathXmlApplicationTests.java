package es.jripoll.ioc.classpathxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IocClassPathXmlApplicationTests {

    @Test
    public void testBasicUsage() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpathxmlapplicationcontext-example.xml"
        );
        Product Product = (Product) context.getBean("product");
        assertEquals(Product.getSku(), "SKU-123456789");
        assertEquals(Product.getName(), "Blue Jeans");
        assertEquals(Product.getStock(), 42);

        Product sameProduct = context.getBean("product", Product.class);
		assertEquals(sameProduct.getSku(), "SKU-123456789");
		assertEquals(sameProduct.getName(), "Blue Jeans");
		assertEquals(sameProduct.getStock(), 42);
    }
}
