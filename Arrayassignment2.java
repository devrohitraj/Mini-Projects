/**
 * 
 */
package Assignment1;

/**
 * @author RO336532
 *
 */
public class Arrayassignment2 {

	/**
	 * @param args
	 */
	static int[][] numbers = new int[3][3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 4){
			System.out.println("Please enter 4 integer numbers");
		}
		
		
		System.out.println("The given array is : ");
		int k = 0;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j<2; j++){
				numbers[i][j] = Integer.parseInt(args[k++]);
				System.out.print(numbers[i][j]+"\t");
			}
		    System.out.println(" ");
		}
		
		System.out.println("The reverse array is : ");
		
		for(int i = 1; i >= 0; i--){
			for(int j = 1; j>=0; j--){
			
				System.out.print(numbers[i][j]+"\t");
			}
		    System.out.println(" ");

	}

	}
}
