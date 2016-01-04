/**
 * 
 */
package OOPS;

/**
 * @author Dev
 *
 */
public class Dog {

	/**
	 * @param args
	 */
	
	int drinkTime = 6;

	/**
	 * @return the drinkingTime
	 */
	public int getDrinkTime() {
		return drinkTime;
	}

	/**
	 * @param drinkingTime the drinkingTime to set
	 */
	public void setDrinkTime(int drinkTime) {
		this.drinkTime = drinkTime;
	}
	
	public boolean needsToGo(){
		
		if(drinkTime > 4){
			return true;
		}
		
		return false;
		
	}

}
