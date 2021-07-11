import java.util.Comparator;


public class SortbasedonCost implements Comparator<Device> {

	@Override
	public int compare(Device d1, Device d2) {
		// TODO Auto-generated method stub
		return d1.getCost()- d2.getCost();
	}
	
	

}
