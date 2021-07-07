
public class IronBox extends Device {

	public IronBox(int power, int time, int memory, int cost) {
		super(power, time, memory, cost);
		// TODO Auto-generated constructor stub
	}
	public void Ipower(){
		System.out.println("Iron box consumes"+power);
	}
	public void Icost(){
		System.out.println("power cost of iron box"+cost);
	}

}
