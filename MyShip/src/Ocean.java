public class Ocean
{
	int Ship[][] = new int [10][10];
	int shotsFired = 0;
	int hitCount = 0;
	int shipsSunk = 0;
	
	Ocean (){}
	
	void placeAllShipsRandomly() {
		
	}
	boolean nextBoolean() {
		return false;
	}
	boolean nextInt(int n){
		return false;
	}
	boolean isOccupied(int row, int column) {
		return false;
	}
	boolean hasSunkShipAt(int row, int column) {
		return false;
	}
	String getShipTypeAt(int row, int column) {
		return "max";
	}
	boolean shootAt(int row, int column) {
		return false;
	}
	int getShotsFired() {
		return 0;
	}
	int getHitCount() {
		return 0;
	}
	int getShipsSunk() {
		return 0;
	}
	boolean isGameOver() {
		return false;
	}
	void print() {
		
		System.out.println(" 0123456789");
		
		for (int row = 0; row <=9; row++){
			System.out.print(row);
			
			for(int collumn = 0; collumn <=9; collumn++){
				System.out.print("~");
			}
			
			System.out.println();
		}
		
	}
	

}
