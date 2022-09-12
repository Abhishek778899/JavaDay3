
public class Smallestarray {

	public static void main(String[] args) {
		 int [] arr = new int [] {77, 90, 56, 104, 109};  
	        //Initialize min with first element of array.  
	        int min = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) 
	        {  
	            //Compare elements of array with min  
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	    }  
	}  