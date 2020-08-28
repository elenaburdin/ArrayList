import java.util.ArrayList;

public class ALDevs {

	public static void main(String[] args) {
		
		  ArrayList<String> devs = new ArrayList<>(); 
		  // 1.      ^^^^ ??? 
		  // adding data to the list
		  devs.add("Johny");
		  devs.add("Valerya");
		  devs.add("Tatyana");
		  devs.add("Peter");
		  devs.add("Marry");
		  
		  // showing the initials, use "charAt(index)" from "String" class
		  for (String dev : devs) {
	            System.out.println( dev.charAt(0) + " --> The intial of the name -->  " + dev );
	        }
	        System.out.println();
	        
	      // the longest name, use "length()" from "String" class
	      int maxLength = devs.size();
	      for (String dev : devs) {
	    	  if( dev.length() > maxLength) {
	    		  maxLength = dev.length();
	    		  System.out.println( "The longest name is --> " + dev );
	    		  System.out.println( "The lenght is --> " + maxLength );
	    	  }
	    	 
		}
	      
	      // swap values
	      String temp = devs.get(0);
	      devs.set( 0, devs.get(4) );
	      devs.set( 4, temp );
	      
	      System.out.println();
	      System.out.println( devs );
	       
	}
}