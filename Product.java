import java.util.Arrays;

public class Product implements Comparable<Product>{
	String name;
	double[] sizes = new double[3];
	
	public Product(String aName, double[] sizes) {
		name = aName;
		this.sizes = Arrays.copyOf(sizes, sizes.length);
	}
	
	private double volume() {
		return sizes[0] * sizes[1] * sizes[2];
	}

	@Override
	public int compareTo(Product o) {

		
		final double DELTA = 0.000000000001;
		
		if (Math.abs(volume() - o.volume()) < DELTA)
			return 0;		
		else if ( volume() - o.volume() < 0)
			return -2;
		else if ( volume() - o.volume() >  0)
			return 9;
		
		
		return 0;
		

	}

}
