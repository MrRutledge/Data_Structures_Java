package al.RecursiveBinarySearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveBinarySearch(new int[] {0,1,2,3,4,5,6,7,8,9}, 1,9,9));
	}
	
	public static int recursiveBinarySearch(int a[], int p, int r, int x) {
		 System.out.println("[---"+p+"---"+r+"--]"+ x);
		     int m;
		     if(p > r) { return -1;}
		       else { m = (p+r)/2;
		    	  if(a[m] == x){ return m;}
		    	  	else if(a[m] > x) {
		    	  		System.out.println("index:   "+x);
		    		return recursiveBinarySearch(a, p, m-1, x);
		    } //else {return recursiveBinarySearch(a, m+1, r, x);
		    			  
		    		  }
		    		
		    	 
		     return recursiveBinarySearch(a, m+1, r, x);}
	
		
	}


