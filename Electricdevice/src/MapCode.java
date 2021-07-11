import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;





public class MapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<Device>> divMap = new HashMap<>();
		
		Device d1 = new Computer(5000, 300, 5, 7000);
		Device d2 = new Computer(6000, 200, 6, 6000);
		Device d3 = new Computer(9000, 400, 5, 10000);
		Device d4 = new Computer(6000, 100, 8, 12000);
		
		List<Device> compList = new ArrayList<>();
		compList.add(d1);
		compList.add(d2);
		compList.add(d3);
		compList.add(d4);
		
		
		Device d5 = new WashingMachine(8000, 60, 5, 10000);
		Device d6 = new WashingMachine(9000, 160, 8, 20000);
		Device d7 = new WashingMachine(6000, 40, 9, 7000);
		
		List<Device> washList = new ArrayList<>();
		washList.add(d5);
		washList.add(d6);
		washList.add(d7);
		
		divMap.put("computer", compList);
		divMap.put("washingmachine", washList);
		//--to get computers where cost is between 5000-8000
		Iterator<String> itr = divMap.keySet().iterator();
		while(itr.hasNext()){
			String devicename=itr.next();
			
			if(devicename.equals("computer")){
				List<Device> devices = divMap.get(devicename);
				for(Device device : devices){
					if(device.getCost()>=5000 && device.getCost()<=8000){
						System.out.println("--------------");
						System.out.println("power--cost--memory--time");
						System.out.println(device);
					}
				}
			}
		}
		System.out.println("------------------");
		Collections.sort(compList, new SortbasedonCost());
		doPrint(compList,"sort based on cost");
		Collections.sort(compList, new SortbasedonPower());
		doPrint(compList,"sort based on power");}
		public static void doPrint(Collection<Device> collection, String tagLine){
			
			System.out.println("\n\n ------"+tagLine+"---");
			System.out.println("power--cost--memory---time");

			for(Device device:collection){
				System.out.println(device);
			}
		

		}
}
		
		

	


