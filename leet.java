import java.util.Stack;

public class leet {

	public static void main(String[] args) {
		int array[] = new int[5];
		for(int num : array) {
			System.out.print(num);
		}
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


