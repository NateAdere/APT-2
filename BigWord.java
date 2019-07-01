import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigWord {
	 public String most(String[] sentences) {
         String empty = " ";
         for (String x : sentences) {
        	 empty = empty + x + " ";
        	 empty = empty.toLowerCase();
         }
         int best = 0;
         String ans = "";
		 for (String x : sentences) {
			 x = x.toLowerCase();
			 List<String> words = new ArrayList<String>(Arrays.asList(x.split(" ")));
        	 for (String v : words) {
        		 String b = " " + v + " ";
        		 int count = ( empty.split(b, -1).length ) - 1;
        		 if (best < count) {
        			 best = count;
        			 ans = v;
        			 continue;
        		 }
        	
       	
        		 
        	 }
        	 
         }
		 return ans;
     }

}
