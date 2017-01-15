public class Submarine extends Ship
{private static final int LENGTH = 1;
	private static final String SHIPTYPE = "Submarine";


	Submarine(){
		super(LENGTH);
	}


	@Override
	String getShipType()
	{
		// TODO: Implement this method
		return SHIPTYPE;
	}
	

}
