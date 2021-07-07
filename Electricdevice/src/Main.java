
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1 = new Main();
		Device washingmachine = new WashingMachine(20000,120, 8,7);
		Device computer = new Computer(2000,300,2, 7);
		Device ironbox = new IronBox(25000, 30,5, 7);
		m1.DisplayPower(washingmachine);
		m1.DisplayCost(washingmachine);
		m1.DisplayPower(computer);
		m1.DisplayCost(computer);
		m1.DisplayPower(ironbox);
		m1.DisplayCost(ironbox);
		
		

	}
	public void DisplayPower(Device d){
		d.TotalConsumption();
		if(d instanceof WashingMachine)
		{
			WashingMachine w = (WashingMachine)d;
			w.WMPower();
		}
		if(d instanceof Computer)
		{
			Computer c =(Computer)d;
			c.CPower();
		}
		if(d instanceof IronBox)
		{
			IronBox i =(IronBox)d;
			i.Ipower();
			
		}
	
	}
	public void DisplayCost(Device d){
		d.TotalCost();
		if(d instanceof WashingMachine){
			WashingMachine w =(WashingMachine)d;
			w.Wcost();
		}
		if(d instanceof Computer){
			Computer c = (Computer)d;
			c.Ccost();
		}
		if(d instanceof IronBox){
			IronBox i= (IronBox)d;
			i.Icost();
		}
	}

}
