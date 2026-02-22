public class uniqueelement {
	  public static void main(String[] args) {
	        int[] arr = {1,4,6,8,6,3,1,7,8,4,3};
	        int ele = 0;
	        for(int i = 0;i<arr.length;i++){
	        		int j = arr[i];
	            ele = ele ^ arr[i];
	        }

	        System.out.println(ele);
	    }
}