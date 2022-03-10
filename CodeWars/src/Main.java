public class Main {
	
	public static void main(String[] args) {
		
		  int[] num = {2, 3, 4, 5, 7, 8};
	      int target = 10;

	        for (int i = 0; i < num.length-1; i++) {
	            for (int j = num.length-1; j > i; j--) {

	                if ((num[i] + num[j]) == target) {
	                    System.out.println("Match found the Pairs are " + num[i] + ", " + num[j]) ;
	                } else {
	                    System.out.println("not there");
	                }
	            }
	        }
	        
	}

}
