package fastFood2;

public class Snack {
	private Integer price;
	private String productName;
	public Snack(Integer price,String productName) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.productName=productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
}
