
public class Encryption {
	public String encrypt(String message){
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String help = "";
	    String ans = "";
	    int num = 0;
	    for (int k = 0; k < message.length(); k++) {
	    	if (message.length() == ans.length()) {
	              break;
	           }
	    	int z = k;
	        num = num + 1;
	             
	        String letter = Character.toString(message.charAt(num-1));
	        if (help.length() > 0) {
	        	String letter3 = Character.toString(ans.charAt(num-2));
	        	int count = ( ans.split(letter3, -1).length ) - 1;
	        	if (count > 1) {
	        		k = k-1;
	        	}
	        }
	        
	      String letter2 = alphabet[k];
	        	
	      if (help.indexOf(letter) > -1) {
	        	letter2 = alphabet[help.indexOf(letter)];
	        		
	       }
	       help = help + letter;
	       ans = ans + letter2;
	        	
	        
	        }
	       
			 return ans;
    }

}
