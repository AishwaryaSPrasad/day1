
public class Device {
	int power;
	int time;
	int memory;
	int cost;
	public Device(int power, int time, int memory, int cost) {
		super();
		this.power = power;
		this.time = time;
		this.memory = memory;
		this.cost = cost;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void TotalConsumption(){
		power=(power/1000);
		System.out.println("Power consumption is"+power+"KW");
	}
	public void TotalCost(){
		cost=cost*time*power;
		System.out.println("Total cost is"+cost);
	}

}
