package shop;

import java.util.List;

public class Clothes {

	String name;
	int size;
	String brand;
	double price;
	int amount;
	int rate;
	List<Comment> comments;
	Kind kind;
	int rateAmount;

	public double rateAvegare() {
		double rateAverage = rate / rateAmount;
		return rateAverage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public int getRateAmount() {
		return rateAmount;
	}

	public void setRateAmount(int rateAmount) {
		this.rateAmount = rateAmount;
	}
	
}
