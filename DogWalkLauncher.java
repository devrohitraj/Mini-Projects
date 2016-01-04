/**
 * 
 */
package OOPS;

/**
 * @author Dev
 *
 */
public class DogWalkLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		DogOwner dogowner = new DogOwner();
		d.needsToGo();
		dogowner.takeForWalk(d);

	}

}
