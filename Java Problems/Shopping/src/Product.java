
public class Product {
	private double price;
	private String productDetail;
	private String productName;
	private int productCode;
	private String Brand;

	public Product(int productCode,String Brand,String productDetail, String productName, double price)
	{
// TODO Auto-generated constructor stub
	
	this.price = price;
	this.productCode = productCode;
	this.productName = productName;
	this.productDetail = productDetail;
	this.Brand = Brand;
	}
	
	public String GetBrand()
	{
		return Brand;
	}
	
	public void SetBrand(String Brand)
	{
		this.Brand = Brand;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(Double Price)
	{
		this.price = Price;
	}
	
	public String getProductDetail()
	{
		return productDetail;
	}
	
	public void setProductDetail(String productDetail)
	{
		this.productDetail = productDetail;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void SetProductName(String productName)
	{
		this.productName = productName;
	}
	
	public int GetProductCode()
	{
		return productCode;
	}

	public void SetProductCode(int productCode)
	{
		this.productCode = productCode;
	}
	
	@Override public String toString()
	{
		return " Price= " + price + " ,Product Details = " + productDetail 
				+" ,Prodcut Name= " + productName + " ,Product Code= "
				+ productCode + " ,Prodcut Brand= "+ Brand;
	}
}
