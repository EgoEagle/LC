import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class leet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		

		String x = "123";
		Integer y = Integer.valueOf(x);
		System.out.print(y);
		
	}
	
	
	//
	public static int[] countBits(int n) {
        int ans[] = new int[n+1];
        int numOnes = 0;
        for(int i =0; i<n+1;i++){
        	int temp = i;
            while(temp!=0){
                if(temp%2 == 1) numOnes++;
                temp=temp>>1;
            }
            ans[i]= numOnes;
            numOnes = 0;
        }
        return ans;
	}

}


