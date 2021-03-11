import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		String[] productNames = { "apple", "appricote", "banana", "lettuce", "carrot", "table", "lamp", "pen", "book" };

		ArrayList<Product> products = new ArrayList<>();

		for (String name : productNames) {
			double sizes[] = {1.1, 2.2, 3.3};
	
			sizes[0] *= 2;
			products.add(new Product(name, sizes));
		}
		
		if (products.get(0).compareTo(products.get(5)) > 0)
			System.out.println("First element is bigger than the fitth element");
		else
			System.out.println("First element is smaller than the fitth element");
		
		System.out.println(products.get(0).compareTo(products.get(0)));
		// TODO make an array of doubles showing w,l,h

		// compare Products by d

	}

}
