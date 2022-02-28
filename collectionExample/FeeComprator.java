package collectionExample;

import java.util.Comparator;

public class FeeComprator  implements Comparator<CompratorStuExample> {

	@Override
	public int compare(CompratorStuExample l1, CompratorStuExample l2) {
		if(l1.fee>l2.fee)
			return 1;
		else if(l1.fee<l2.fee)
		return -1;
		else
			return 0;
	}
	

}
