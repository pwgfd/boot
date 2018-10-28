package boot.model;

import java.math.BigDecimal;

public class Product {

	private String name;

	private BigDecimal price;

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
