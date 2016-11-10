package pl.javastart.jaxb.unmarshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pl.javastart.model.Product;

public class UnmarshallerExample {
	public static void main(String[] args) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(Product.class);
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		
		Product product = (Product) unmarshaller.unmarshal(new File("product.xml"));
		System.out.println(product);
	}
}
