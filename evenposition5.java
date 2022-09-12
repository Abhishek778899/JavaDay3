
public class Evenposition {

	public static void main(String[] args) 
	{
		int [] numbers = new int [] {6, 12 , 35, 26, 190, 97};

	    System.out.println("Array Elements on even Positions: ");
	    
	    for (int i = 1; i < numbers.length; i = i+2) {
	      System.out.println(numbers[i]);
	    }
	  }
	}  		
