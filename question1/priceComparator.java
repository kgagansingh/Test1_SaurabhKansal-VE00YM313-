package test.question1;

import java.util.Comparator;

public class priceComparator implements Comparator<merchandise> {

	@Override
	public int compare(merchandise arg0, merchandise arg1) {
		// TODO Auto-generated method stub
		return (int) (arg0.getPrice() - arg1.getPrice());
	}

}
