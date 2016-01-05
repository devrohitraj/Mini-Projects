package OOPSAssignment;
import OOPSAssignment.Patient;

public class Patients {
	
	static Patient[] patient = new Patient[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 10){
			System.out.println("Please Enter 10 inputs");
		}
		
		for( int i = 0; i < 10; i++){
			
			patient[i] = new Patient(args[i]);
		}
		
		patient[0].setHeight(72);
		patient[0].setWeight(132);
		patient[1].setHeight(78);
		patient[1].setWeight(142);
		patient[2].setHeight(77);
		patient[2].setWeight(182);
		patient[3].setHeight(92);
		patient[3].setWeight(162);
		patient[4].setHeight(79);
		patient[4].setWeight(192);
		patient[5].setHeight(72);
		patient[5].setWeight(112);
		patient[6].setHeight(70);
		patient[6].setWeight(122);
		patient[7].setHeight(79);
		patient[7].setWeight(182);
		patient[8].setHeight(92);
		patient[8].setWeight(192);
		patient[9].setHeight(62);
		patient[9].setWeight(112);
		
		for( int i = 0; i < 10; i++){
			double bmi = patient[i].BMI(patient[i].getWeight(), patient[i].getHeight());
			
			if(bmi > 25.0){
				System.out.println(args[i]);
			}
		}

	}

}
