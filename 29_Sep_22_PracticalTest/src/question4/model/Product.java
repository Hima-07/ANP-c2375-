package question4.model;

public class Product {
	
	private int productId;
	private String productName;
	private float productPrize;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(float productPrize) {
		this.productPrize = productPrize;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrize=" + productPrize
				+ "]";
	}
}
