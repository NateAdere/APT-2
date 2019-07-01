

import java.util.Arrays;

public class Anonymous {
	 public int howMany(String[] headlines, String[] messages) {
		 int counts[] = new int[256];
		 for (String x : headlines) {
			 for (char ch : x.toLowerCase().toCharArray()) {
				 if (ch == ' ') continue;
				 counts[ch] = counts[ch] + 1; 		 
			 }	 
         }
		 int ans = 0;
		 for (String x : messages) {
//			 System.out.println(x);
			 if (x.matches("\\s+")) {
				 ans = ans + 1;
//				 System.out.print("x equals");
//				 System.out.println("answer is" + ans);
			 }
			 int storech = 0;
			 int[] copycounts = counts.clone();
			 innerloop:
			 for (char ch : x.toLowerCase().toCharArray()) {
				 String b = x.replaceAll("\\s+", "");
				 int a = b.length();
				 if (ch == ' ') continue;
				 if (copycounts[ch] > 0) {
					 storech = storech + 1;
					 copycounts[ch] = copycounts[ch] - 1;
					 if (storech == a) {
						 ans = ans + 1;
//						 System.out.println("answer is" + ans);
					 }
					 continue;
				 }
				 if (counts[ch] == 0) {
					 break innerloop;
				 }
			 }
		 }
		 
//		 System.out.println("answer is "+ ans);
         return ans;
   }
	 
	 public static void main(String args[]) {
		 Anonymous print = new Anonymous();
		 String[] a = {"abcdef ", " abcdef " };
		 String[] b = {"AaBbCc ", " aabbbcc ", " ", " FADE "};
//		 String[] b = {"AaBbCc ", " aabbbcc ", " ", " FADE " };
		 System.out.print("answer is " + print.howMany(a,b));

	 }

}
