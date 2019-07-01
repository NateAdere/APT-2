

public class TrueSpace {
	 public long calculateSpace(int[] sizes, int clusterSize) {
		double num = 0;
		for (int id: sizes) {
	           if (id > clusterSize) {
	              int num1 = (int) Math.ceil((id+.0) /clusterSize);
	              num = num + clusterSize*num1;
				}
	           if (id < clusterSize) {
	              if (id == 0) {
	                continue;
	              }
					num = num + clusterSize;
				}
	           if (id == clusterSize) {
	               num = num + id;
	           }
	        }

	        return (long) num;
        	
        	
        	
      }

}
