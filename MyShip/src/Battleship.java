public class Battleship extends Ship
{
	private static final int LENGTH = 4;
	private static final String SHIPTYPE = "Battleship";
	
	
	Battleship(){
		super(LENGTH);
	}
	
	
	@Override
	String getShipType()
	{
		// TODO: Implement this method
		return SHIPTYPE;
	}

	
}
