import java.util.HashSet;
import java.util.Set;


public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Device> divSet = new HashSet<>();
		divSet.add(new Computer(2000, 300, 7, 40000));
		divSet.add(new Computer(4000, 250, 8, 7000));
		divSet.add(new WashingMachine(2000, 60, 5, 3000));
		
		System.out.println(divSet.size());
		System.out.println(divSet);
		

	}

}
