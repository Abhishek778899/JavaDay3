
public class Oddposition {

	public static void main(String[] args) 
	{
		     int inputArray[] = new int[] { 100,  -500, 450, -200,
                1000, -213, 750 };

             System.out.println("Existing array elements ..");
             for (int i = 0; i < inputArray.length; i++) 
             {
            	 System.out.println(inputArray[i]);
             }

                  System.out.println("Array elements at odd position..");


             for (int i = 0; i < inputArray.length; i++) 
             {
  
              if (i % 2 == 0) 
              {
      
               System.out.println(inputArray[i]);
              }
       }
   }
}
