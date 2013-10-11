package info;

public class WorkOut {
	
	private static final double COST = 1.67;
	
	private double kwatts;
	private double cost;
	private double costPHr;
	private String deviceName;

	
	
	public WorkOut(double watts, double hours, String device){
		convertToKwatts(watts);
		costOfBulbs();
		costByHour(hours);
		device(device);
	}

	public double getKwatts() {
		return kwatts;
	}
	public double getCost(){
		return cost;
	}
	public String getDevice(){
		return deviceName;
	}

	private double convertToKwatts(double watts) {
		kwatts = watts / 1000;
		return kwatts;
	}
	private double costOfBulbs(){
		cost = kwatts * COST;
		return cost;
	}
	private double costByHour(double hours){
		costPHr = cost * hours;
		return costPHr;
	}
	private void device(String device){
		int deviceId = Integer.parseInt(device);
		switch(deviceId){
		case 1:	deviceName = "Bulbs";break;
		case 2:	deviceName = "Geyser";break;
		case 3:	deviceName = "Pool Pump";break;
		case 4:	deviceName = "Fridge";break;
		default: deviceName = "No device selected";break;
				
		}
		
	}

}
