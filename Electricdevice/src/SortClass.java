import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Device> divSet = new TreeSet<>();
		divSet.add(new Computer(2000, 1500, 8, 4000));
		divSet.add(new Computer(1000, 2500, 4, 3000));
		divSet.add(new Computer(5000, 1500, 5, 2000));
		
		
		doPrint(divSet,"default data redering");
		
		List<Device> costBasedList = new ArrayList<>();
		costBasedList.addAll(divSet);

		List<Device> powerBasedList = new ArrayList<>();
		powerBasedList.addAll(divSet);
		
	Collections.sort(costBasedList, new SortbasedonCost());
	doPrint(costBasedList,"sort based on cost");
	Collections.sort(powerBasedList, new SortbasedonPower());
	doPrint(powerBasedList,"sort based on power");
		
		

	}
	public static void doPrint(Collection<Device> collection, String tagLine){
		
		System.out.println("\n\n ------"+tagLine+"---");
		System.out.println("power--cost--memory---time");

		for(Device device:collection){
			System.out.println(device);
		}
	}
	

}
