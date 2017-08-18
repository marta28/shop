package shop;

import java.util.Date;
import java.util.List;

public class Order {

	List<Clothes> clothes;
	Date orderDate;
	Date deliveryDate;
	User user;

	public double price() {
		double sum = 0;
		for (Clothes clothes2 : clothes) {
			double clothPrice = clothes2.getPrice();
			sum += clothPrice;
		}
		return sum;
	}

	public double rebate(double sum, String rebateCode ) {
		String validCode = "Yes";
		double rebate = 0.85;
		if (rebateCode.equals(validCode)) {
			sum *= rebate;
		}
		return sum;
	}
}
