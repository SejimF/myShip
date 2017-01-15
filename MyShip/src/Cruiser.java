public class Cruiser extends Ship
{
	private static final int LENGTH = 3;
	private static final String SHIPTYPE = "Cruiser";


	Cruiser(){
		super(LENGTH);
	}


	@Override
	String getShipType()
	{
		// TODO: Implement this method
		return SHIPTYPE;
	}
	
	
}
