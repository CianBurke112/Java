package carBuilder;

public class SportsCarBuilder implements CarBuilder{
	
	private final Car car = new Car("Sports car");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 150.9, " +
				"overall width (inches): 66.2, overall height (inches): 46.7, wheelbase (inches): 112.9," +
				" front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
	}
	
	@Override
	public void buildPower(){
		car.setPower("340 hp @ 7,750 rpm; 312 ft lb of torque @ 5,000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("5L Duramax V 8 DOHC");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Front seat center armrest.");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Tinted side windows.Fixed rear window with defroster");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 25 MPG city, 35 MPG highway, 31 MPG combined and 524 mi. range");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
	
}
