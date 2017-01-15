abstract class Ship
{
	
	int bowRow;
	int bowColumn;
	int length;
	boolean horizontal;
	boolean[] hit;
	
	Ship(int length){
		
		this.length = length;
	
		}
		
	int getBowRow() {
		return bowRow;
		}
	int getBowColumn() {
		return bowColumn;
		}
	boolean isHorizontal() {
		return horizontal;
		}
	int getLength() {
		return length;
	}
	abstract String getShipType();
	
	void setBowRow(int row) {
		
	}
	void setBowColumn(int column) {
		
	}
	void setHorizontal(boolean horizontal){
		
	}
	boolean shootAt(int row, int column){
		return false;
	}
	boolean isRealShip() {
		return false;
	}
	boolean isSunk(){
		return false;
	}
	
}
