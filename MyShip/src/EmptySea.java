public class EmptySea extends Ship
{
	private static final int LENGTH = 1;
	private static final String SHIPTYPE = "Empty sea";


	EmptySea(){
		super(LENGTH);
	}


	@Override
	String getShipType()
	{
		// TODO: Implement this method
		return SHIPTYPE;
	}
	
}
