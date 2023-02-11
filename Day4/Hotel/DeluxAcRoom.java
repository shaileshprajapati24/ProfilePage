package Hotel;



public class DeluxAcRoom extends DeluxeRoom {
	private int ratePerSqFeet;

	public DeluxAcRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=12;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	
}