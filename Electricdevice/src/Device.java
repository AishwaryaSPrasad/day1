
public class Device implements Comparable<Device> {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + memory;
		result = prime * result + power;
		result = prime * result + time;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (cost != other.cost)
			return false;
		if (memory != other.memory)
			return false;
		if (power != other.power)
			return false;
		if (time != other.time)
			return false;
		return true;
		
		
	}
	@Override
	public int compareTo(Device d) {
		// TODO Auto-generated method stub
		return this.getCost()- d.getCost();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+power+"\t"+cost+"\t"+memory+"\t"+time+"\n";
	}
	
	
	
	
	
	
	

}
