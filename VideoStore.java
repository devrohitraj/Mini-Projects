package OOPS2;
import OOPS.Dog;
import OOPS2.Video;

public class VideoStore {
	
	String[] videos = new String[10];
	String[] check = new String[10];
	int counter1, counter2, counter3,counter4;
	
	public void addVideo(String title){
		
		videos[counter1++] = title;
	}
	
	public void checkOut(String title){
		
		for(String s : videos){
			counter3++;
			if(s.equalsIgnoreCase(title)){
				check[counter2++] = title;
				videos[counter3] = "";
			}
			
		}
	}
	
    public void returnVideo(String title){
    	
    	for(String s : check){
    		counter4++;
    		if(s.equalsIgnoreCase(title)){
    			videos[counter1++] = title;
    			check[counter4] = "";
    		}
    	}
	}
    
    public static float recieveRating(String title, int rating){
    	int count = 1;
    	Video.userRating = (Video.userRating + rating) / count;
    	count++;
    	return Video.userRating;
		
	}
    
    public String listInventory(){
		for(String s : videos){
			if(s.equals("")) continue;
			return s;
		}
		return null;
    	
    }


}
