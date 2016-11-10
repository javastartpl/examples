package pl.javastart.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	
	@XmlTransient
	private int id;
	private String name;
	private String producer;
	private double price;
	
	public Product() {}
	
	public Product(int id, String name, String producer, double price) {
		this.id = id;
		this.name = name;
		this.producer = producer;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id 
				+ ", name=" + name 
				+ ", producer=" + producer
				+ ", price=" + price + "]";
	}
	
}
