package ArraylistQuestion;

public class SmartPhone1
{
	 String brand,model;
	 int price,rating;
	public SmartPhone1(String brand, String model, int price, int rating) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.rating = rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + "]";
	}
	
	 
}