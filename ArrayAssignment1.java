/**
 * 
 */
package Assignment1;

/**
 * @author RO336532
 *
 */
public class ArrayAssignment1 {

	/**
	 * @param args
	 */
	static int[][] numbers = new int[3][3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 9){
			System.out.println("Please enter 9 integer numbers");
		}
		
		
		/*
		int i = 0;
		String givenvalue = args[i];
		for(int k = 0; k < 3; k++){
	    for(int j = 0; j<3; j++){
		//numbers[i] = Integer.parseInt(givenvalue);
	    	numbers
	    	*/
		
		
		System.out.println("The given array is : ");
		int k = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				numbers[i][j] = Integer.parseInt(args[k++]);
				System.out.print(numbers[i][j]+"\t");
			}
		    System.out.println(" ");
		}
		
		
        
		int temp = numbers[0][0];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
			
			if(temp < numbers[i][j]){
				temp = numbers[i][j];
			}
			
			
		}
		}
		
		System.out.println("The biggest number in the given array is " +temp);
        
		
        

	}

	}
