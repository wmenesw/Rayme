package App;

public class Road {
	
	private int time;
	private int distance;
	private int timeCost;
	private int fuelCost;
	
	
	
	public int getDistance() {
		return distance;
	}
	
	public int getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(int timeCost) {
		this.timeCost = timeCost;
	}

	public int get_fuelCost(int distance) {
		int fuelPerKm = 29;
		fuelCost = distance * fuelPerKm;
		
		return fuelCost;
	}
	
	public int get_totalCost() {
		return fuelCost + timeCost;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public int getFuelCost(int fuelCost) {
		return fuelCost;
	}
	
	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	

}
