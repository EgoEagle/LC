import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class leet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		

	/*	String x = "123";
		int y = Integer.valueOf(x);
		int z = 345;
		String a = String.valueOf(z);
		System.out.println(y+y);
		System.out.print(a);*/
		ArrayList<Integer> al = new ArrayList<Integer>();
		int nums[] = new int[] {4 , 2 , 10 , 22, 9 };
		String words[] = new String[] {"bat","bart","chat","hm", "ok","p"};
		Arrays.sort(nums);
		Arrays.sort(words);
		
		for(int i = 0 ; i<words.length;i++) {
			
			System.out.println(words[i]);
		}
		
		update(al);
		update(al);
		update(al);
		
		System.out.print(al);
		

		
		
	}
	
	public static void update(ArrayList<Integer> al) {
		al.add(3);
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


