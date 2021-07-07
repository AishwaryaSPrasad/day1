
public class Computer extends Device {

	public Computer(int power, int time, int memory, int cost) {
		super(power, time, memory, cost);
		// TODO Auto-generated constructor stub
	}
	public void CPower(){
		System.out.println("computer consumes"+power);
	}
	public void Ccost(){
		System.out.println("power cost of computer "+cost);
	}

}
