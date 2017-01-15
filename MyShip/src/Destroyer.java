public class Destroyer extends Ship
{private static final int LENGTH = 2;
	private static final String SHIPTYPE = "Destroyer";


	Destroyer(){
		super(LENGTH);
	}


	@Override
	String getShipType()
	{
		// TODO: Implement this method
		return SHIPTYPE;
	}
	
}
