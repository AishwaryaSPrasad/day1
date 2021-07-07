
public class WashingMachine extends Device {

	public WashingMachine(int power, int time, int memory, int cost) {
		super(power, time, memory, cost);
		// TODO Auto-generated constructor stub
	}
	public void WMPower(){
		System.out.println("Washing machine consumes power of"+power+"KW");
	}
	public void Wcost(){
		System.out.println("power cost of washing machine is"+cost);
	}

}
